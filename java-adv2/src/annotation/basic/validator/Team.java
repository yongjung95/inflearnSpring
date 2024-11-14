package annotation.basic.validator;

public class Team {

    @NotEmpty(message = "이름이 비어있습니다.")
    private String name;

    @Range(min = 1, max = 100, message = "나이는 1과 100 사이여야 합니다.")
    private int memberCount;

    public Team(String name, int memberCount) {
        this.name = name;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
