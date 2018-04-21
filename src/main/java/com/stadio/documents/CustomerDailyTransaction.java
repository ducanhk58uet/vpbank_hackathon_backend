package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "Customer_daily_transaction")
@Data
public class CustomerDailyTransaction {

    @Id
    private String id;

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

    @Field(value = "date")
    private Date date;

}
