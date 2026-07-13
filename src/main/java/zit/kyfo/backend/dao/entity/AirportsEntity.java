package zit.kyfo.backend.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Objects;

@Entity(name = "airport_entity")
@Table(name = "airport")
@NoArgsConstructor
public class AirportsEntity extends AbstractEntity<Integer> implements Serializable {

    private String name;
    private String uniqueCode;
    private String town;
    private String address;

    public AirportsEntity(String name, String uniqueCode, String town, String address) {
        setName(name);
        setUniqueCode(uniqueCode);
        setTown(town);
        setAddress(address);
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return this.name;
    }

    @Column(name = "unique_code", nullable = false, unique = true)
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    @Column(name = "town")
    public String getTown() {
        return this.town;
    }

    @Column(name = "address")
    public String getAddress() {
        return this.address;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setUniqueCode(@NonNull String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public void setTown(@NonNull String town) {
        this.town = town;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirportsEntity that = (AirportsEntity) o;
        return Objects.equals(name, that.name) && Objects.equals(uniqueCode, that.uniqueCode) && Objects.equals(town, that.town) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uniqueCode, town, address);
    }
}
