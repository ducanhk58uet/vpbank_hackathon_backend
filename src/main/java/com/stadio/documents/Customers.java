package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "customers")
public class Customers {

    @Id
    private String id;

    @Field(value = "fullname")
    private String fullname;

    @Field(value = "customer_id")
    private long customer_id;

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
    private boolean hasCreditCard;

    @Field(value = "has_internet_banking")
    private boolean hasInternetBanking;

    @Field(value = "use_vpbankplus")
    private boolean useVpbankplus;

    @Field(value = "use_dream")
    private boolean use_dream;


}
