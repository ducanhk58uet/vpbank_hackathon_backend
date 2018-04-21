package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    @Field(value = "fullname")
    private String fullname;

    @Field(value = "customer_id")
    private String customerId;

    @Field(value = "join_date")
    private Date joinDate;

    @Field(value = "debit_card_transactions_count")
    private int debitCardTransactionsCount;

    @Field(value = "credit_card_transactions_count")
    private int creditCardTransactionsCount;

    @Field(value = "withdrawal_counts")
    private int withdrawalCounts;

    @Field(value = "deposits_count")
    private int depositsCount;

    @Field(value = "telco_topups_count")
    private int telcoTopupsCount;

    @Field(value = "utility_payments_count")
    private int utilityPaymentsCount;

    @Field(value = "has_credit_card")
    private int hasCreditCard;

    @Field(value = "has_internet_banking")
    private int hasInternetBanking;

    @Field(value = "use_vpbankplus")
    private int useVpbankplus;

    @Field(value = "use_dream")
    private int useDream;

    @Field(value = "point")
    private int point;

   @Field(value = "exp")
   private int exp;

   @Field(value = "rank_id")
   private String rank_id;

    public Customer(String fullname, String customerId, Date joinDate, int debitCardTransactionsCount,
                    int creditCardTransactionsCount, int withdrawalCounts, int depositsCount,
                    int telcoTopupsCount, int utilityPaymentsCount, int hasCreditCard,
                    int hasInternetBanking, int useVpbankplus, int useDream) {
        this.fullname = fullname;
        this.customerId = customerId;
        this.joinDate = joinDate;
        this.debitCardTransactionsCount = debitCardTransactionsCount;
        this.creditCardTransactionsCount = creditCardTransactionsCount;
        this.withdrawalCounts = withdrawalCounts;
        this.depositsCount = depositsCount;
        this.telcoTopupsCount = telcoTopupsCount;
        this.utilityPaymentsCount = utilityPaymentsCount;
        this.hasCreditCard = hasCreditCard;
        this.hasInternetBanking = hasInternetBanking;
        this.useVpbankplus = useVpbankplus;
        this.useDream = useDream;

    }
}
