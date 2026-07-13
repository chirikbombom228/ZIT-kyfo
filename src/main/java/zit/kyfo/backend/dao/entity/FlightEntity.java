package zit.kyfo.backend.dao.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity(name = "flight_entity")
@Table(name = "flight")
@NoArgsConstructor
public class FlightEntity extends AbstractEntity<Integer> implements Serializable {

    private AirlinesEntity airlines;
    private String airplane;
    private AirportsEntity airportFrom;
    private AirportsEntity airportTo;
    private ZonedDateTime timeOut;
    private ZonedDateTime timeIn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    public AirlinesEntity getAirlines() {
        return this.airlines;
    }

    public void setAirlines(AirlinesEntity airlines) {
        this.airlines = airlines;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public AirportsEntity getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(AirportsEntity airportFrom) {
        this.airportFrom = airportFrom;
    }

    public AirportsEntity getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(AirportsEntity airportTo) {
        this.airportTo = airportTo;
    }

    public ZonedDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(ZonedDateTime timeOut) {
        this.timeOut = timeOut;
    }

    public ZonedDateTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(ZonedDateTime timeIn) {
        this.timeIn = timeIn;
    }
}
