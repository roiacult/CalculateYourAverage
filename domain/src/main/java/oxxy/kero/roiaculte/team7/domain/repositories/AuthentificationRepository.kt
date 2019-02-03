package oxxy.kero.roiaculte.team7.domain.repositories

import com.sun.net.httpserver.Authenticator
import oxxy.kero.roiaculte.team7.domain.exception.Failure
import oxxy.kero.roiaculte.team7.domain.functional.Either
import oxxy.kero.roiaculte.team7.domain.interactors.None
import oxxy.kero.roiaculte.team7.domain.use_cases.RegistrationModel

interface  AuthentificationRepository{
    suspend  fun registreUser(user: RegistrationModel):Either<Failure, None>

}