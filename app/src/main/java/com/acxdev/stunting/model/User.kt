package com.acxdev.stunting.model

class User {
    var name: String? = null
    var birthDate: String? = null
    var gender: String? = null
    var mail: String? = null
    var phone: String? = null
    var pregnant: String? = null
    var role: String? = null

    constructor()

    constructor(
        name: String? = null,
        birthDate: String? = null,
        gender: String? = null,
        mail: String? = null,
        phone: String? = null,
        pregnant: String? = null,
        role: String? = null
    ) {
        this.name = name
        this.birthDate = birthDate
        this.gender = gender
        this.mail = mail
        this.phone = phone
        this.pregnant = pregnant
        this.role = role
    }
}