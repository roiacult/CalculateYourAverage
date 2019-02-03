package oxxy.kero.roiaculte.team7.CalculateYourAverage.Repositories

import oxxy.kero.roiaculte.team7.CalculateYourAverage.Firebase.AuthentificationFirebase
import oxxy.kero.roiaculte.team7.domain.exception.Failure
import oxxy.kero.roiaculte.team7.domain.functional.Either
import oxxy.kero.roiaculte.team7.domain.interactors.None
import oxxy.kero.roiaculte.team7.domain.repositories.AuthentificationRepository
import oxxy.kero.roiaculte.team7.domain.use_cases.RegistrationModel
import javax.inject.Inject

class AuthentificationRepositoryImpl @Inject constructor(private val authentificator:AuthentificationFirebase)
    :AuthentificationRepository{
    override suspend fun registreUser(user: RegistrationModel): Either<Failure, None> {
        return authentificator.registreUserWithEmail(user.mail , user.pass)
    }
}