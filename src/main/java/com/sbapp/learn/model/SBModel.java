package com.sbapp.learn.model;
@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SBModel {
    private static Logger LOGGER = LoggerFactory.getLogger(SBModel.class);
    private Long id;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "SBModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
