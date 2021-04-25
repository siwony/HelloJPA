package relationshipManage_05.entity;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // Use getter during code generator JPA 는 proxy 객체를 조회 할 수 있으므로 getter 를 통해 값을 복사하여 접근한다. 프록시 객체를 조회하면 계산이 안된다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getZipcode(), address.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getZipcode());
    }
}
