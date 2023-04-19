package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public final class Font {
    // flyweight에 해당하는 인스턴스는 불변이여야 한다.(= 공유하는 데이터이기 떄문에 값이 변경 되어서는 안된다.)
    // 모든 속성에 final , class에 final을 붙여 상속을 막는다.
    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
