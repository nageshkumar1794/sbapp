

@Service
public class SBService {

    @Autowired
    private HelloRepository helloRepository;

    private List<SBModel> sbModels = new ArrayList<>();

    public SBModel addSB(SBModel sbModel) {
        LOGGER.info("SB add: {}", sbModel);
        HelloEntity helloEntity = new HelloEntity();
        helloEntity.setName(sbModel.getName());
        helloEntity.setDescription(sbModel.getDescription());

        HelloEntity savedEntity = helloRepository.save(helloEntity);
        SBModel sm = SBModel.builder()
                .name(savedEntity.getName())
                .description(savedEntity.getDescription())
                .id(savedEntity.getId())
                .build();
        return sm;
    }

    public List<SBModel> findAll() {
        LOGGER.info("SB findAll: {}");

        List<SBModel> sbms = new ArrayList<>();
        List<HelloEntity> entities = helloRepository.findAll();
        for (HelloEntity entity : entities) {
            SBModel sm = SBModel.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .description(entity.getDescription())
                    .build();
            sbms.add(sm);
        }
        return sbms;
    }

    public SBModel findById(Long id) {
        LOGGER.info("SB findById: {}", id);
        HelloEntity entity = helloRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SB not found with id: " + id));

        SBModel sm = SBModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .build();
        return sm;
    }

}