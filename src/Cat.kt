class Cat (val name: String, var age: Int, var weight: Int) {
    // Make the cat walk.
    // Reduces weight by one
    // Should check if the weight is 5 or more
    // There is a bug - don't resolve until instructed by the exercise.
    fun walk() :Boolean {
        if(weight >= 5) {
            weight--
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
