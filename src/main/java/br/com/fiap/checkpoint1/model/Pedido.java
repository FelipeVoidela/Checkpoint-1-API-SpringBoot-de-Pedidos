package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String clienteNome;
    
    @Column(nullable = false, updatable = false)
    private LocalDate dataPedido = LocalDate.now();
    
    @Column(nullable = false)
    private double valorTotal;
    
    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("O valor total não pode ser negativo.");
        }
        this.valorTotal = valorTotal;
    }
}
