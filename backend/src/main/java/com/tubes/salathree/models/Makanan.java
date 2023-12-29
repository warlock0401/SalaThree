package com.tubes.salathree.models;

// import java.time.LocalDateTime;
// import java.util.List;

// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;
//import java.util.List;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Makanan")
public class Makanan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int makanan_id;

    @Column(name = "nama_makanan", length = 100)
    private String name_makanan;

    @Column(name = "harga", length = 100)
    private int harga;

    public Makanan() {
    }

    public Makanan(int makanan_id, String name_makanan, int harga) {
        this.makanan_id = makanan_id;
        this.name_makanan = name_makanan;
        this.harga = harga;
    }

    public int getMakanan_id() {
        return this.makanan_id;
    }

    public void setMakanan_id(int makanan_id) {
        this.makanan_id = makanan_id;
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
