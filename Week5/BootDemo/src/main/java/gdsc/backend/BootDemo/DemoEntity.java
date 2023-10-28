package gdsc.backend.BootDemo;

import lombok.Getter;

//getId, getName
@Getter
public class DemoEntity {
    private Long id;
    private String name;

    public DemoEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
