package Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transaction {
    @Id
    private String transactionId;
    @ManyToOne
    @JoinColumn(name="userId" ,nullable = false)
    private String user;

    @ManyToOne
    @JoinColumn(name="bookId" , nullable = false)
    private String book;

}
