package com.zalopay.payment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String uuid;

    private String phone;

    private String fullName;

//     1. Binding request
//         1.1 payload
//         orderId: -> how to create ?
//         merchant credentials. Check whether this merchant had registered with wallet ?
//         customer partnerClientId => for what, take from where
//
//     Binding success => return cbToken => forwhat
//     Response including binding and transaction result (if exists)
//     Use cbToken => request recurring token
//     Generate recurring token as aesToken (momo encrypt)
//     Decrypt the aesToken to get the recurring token (merchant do => how to decrypt?) => secret key provided by Momo after registration
//
//     2. Payment
//     - Using recurring token to pay
//     - Create order
//     - Proceed order and return tracsaction result
//     - Fail => retry (implement later) => redirect back to app to select another payment method
//     - Success => display payment result

// merchant => register with momo => merchant id/ orderId và tId => tid để quản lý ghi nhận transaction
// orderId để làm gì ? => xác thực là mỗi lần request đi là th merchant gửi ??? sao k dùng luôn ?
// mỗi th merchant sẽ có 1 cặp public key/private key đc server sinh ra và trả về để mã hóa dữ liệu
// API idempotency => who generate the request Id? => why it won't fail => spam cái requestId nó n lần => thì số tiền vẫn v ?
// ipnUrl => inform to vendor the result of payment => POST method
// requestType => linkWallet/captureWallet
// lang => tomorrow investigate this topic 
//


}
