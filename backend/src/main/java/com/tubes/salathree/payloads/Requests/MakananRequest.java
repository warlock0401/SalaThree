package com.tubes.salathree.payloads.Requests;

public class MakananRequest {
    private String name_makanan;
    private int harga;

    public MakananRequest() {
    }

    public MakananRequest(String name_makanan, int harga) {
        this.name_makanan = name_makanan;
        this.harga = harga;
    }

    public String getName_makanan() {
        return this.name_makanan;
    }

    public void setName_makanan(String name_makanan) {
        this.name_makanan = name_makanan;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
