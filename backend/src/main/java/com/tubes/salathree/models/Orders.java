package com.tubes.salathree.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "pelanggan_id")
    private Pelanggan pelanggan_id;

    @Column(length = 64)
    private int total;

    @OneToMany(mappedBy = "makanan_id", cascade = CascadeType.ALL)
    private List<Makanan> pesanan;

    public Orders() {
    }

    public Orders(Integer order_id, Pelanggan pelanggan_id, int total, List<Makanan> pesanan) {
        this.order_id = order_id;
        this.pelanggan_id = pelanggan_id;
        this.total = total;
        this.pesanan = pesanan;
    }

    public Integer getOrder_id() {
        return this.order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Pelanggan getPelanggan_id() {
        return this.pelanggan_id;
    }

    public void setPelanggan_id(Pelanggan pelanggan_id) {
        this.pelanggan_id = pelanggan_id;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Makanan> getPesanan() {
        return this.pesanan;
    }

    public void setPesanan(List<Makanan> pesanan) {
        this.pesanan = pesanan;
    }

}
