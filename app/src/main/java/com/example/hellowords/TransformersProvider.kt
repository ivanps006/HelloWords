package com.example.hellowords

class TransformersProvider {
    companion object{
        // He reemplazado las URLs problemáticas por URLs directas de prueba (placeholders).
        // Si esto funciona, reemplaza por imágenes directas (terminadas en .jpg/.png) alojadas en un servidor público.
        val transformersList = listOf<Transformers>(
            Transformers(
                "Optimus Prime",
                "Camion",
                "Autobot",
"https://www.google.com/url?sa=i&url=https%3A%2F%2Faminoapps.com%2Fc%2Fmore-than-meets-the-eye%2Fpage%2Fitem%2Foptimus-prime-movieverse%2Fz12a_xGFwIYrlJrJKvb14qaLaxpmmm1ePx&psig=AOvVaw0U03TO1ZIfAzIHfRb-WEO2&ust=1763460085540000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCJjwrPH2-JADFQAAAAAdAAAAABAT"            ),
            Transformers(
                "Bumblebee",
                "Coche",
                "Autobot",
                "https://via.placeholder.com/150?text=Bumblebee"
            ),
            Transformers(
                "Megatron",
                "Avion",
                "Decepticon",
                "https://via.placeholder.com/150?text=Megatron"
            ),
            Transformers(
                "IronHide",
                "Camioneta",
                "Autobot",
                "https://via.placeholder.com/150?text=Ironhide"
            ),
            Transformers(
                "Starscream",
                "Avion F22",
                "Decepticon",
                "https://via.placeholder.com/150?text=Starscream"
            ),
            Transformers(
                "Shockwave",
                "Tanque Cybertroniano",
                "Decepticon",
                "https://via.placeholder.com/150?text=Shockwave"
            ),
            Transformers(
                "Ratchet",
                "Ambulancia",
                "Autobot",
                "https://via.placeholder.com/150?text=Ratchet"
            )
        )
    }
}