package com.ashwin.energygovernance.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "waste_generation", schema = "hotels")
public class WasteGeneration extends TableEntity<BigInteger> implements Serializable {

  private static final long serialVersionUID = -7610585510487971570L;

  @Id
  @Column(name = "id", updatable = false)
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "hotels.waste_generation_id_seq")
  private BigInteger id;

  @Column(name = "quantity")
  private BigInteger quantity;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "hotel_id", nullable = false)
  private Hotel hotel;

  public BigInteger getId() {
    return id;
  }

  public void setId(BigInteger id) {
    this.id = id;
  }

  public BigInteger getQuantity() {
    return quantity;
  }

  public void setQuantity(BigInteger quantity) {
    this.quantity = quantity;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public WasteGeneration(BigInteger id, BigInteger quantity) {
    super();
    this.id = id;
    this.quantity = quantity;
  }

  public WasteGeneration() {
  }

}
