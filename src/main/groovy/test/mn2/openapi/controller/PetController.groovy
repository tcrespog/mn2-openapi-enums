package test.mn2.openapi.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import test.mn2.openapi.domain.Pet

@Controller('/pet')
class PetController {

    @Get('/')
    HttpResponse<Pet> get() {
        return null
    }

}
