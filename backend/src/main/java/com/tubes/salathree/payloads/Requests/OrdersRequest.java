package com.tubes.salathree.payloads.Requests;
import java.util.List;

import com.tubes.salathree.models.*;

public class OrdersRequest {
    Pelanggan pelanggan_id;
    int total;
    List<Makanan> pesanan;

    public OrdersRequest() {
    }


    public OrdersRequest(Pelanggan pelanggan_id, int total, List<Makanan> pesanan) {
        this.pelanggan_id = pelanggan_id;
        this.total = total;
        this.pesanan = pesanan;
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
