// Simple Fun #152: Invite More Women?
// https://www.codewars.com/kata/58acfe4ae0201e1708000075/train/kotlin

// King Arthur and his knights are having a New Years party.
// Last year Lancelot was jealous of Arthur, because Arthur had a date and Lancelot did not, and they started a duel.
// To prevent this from happening again, Arthur wants to make sure that there are at least as many women as men at this year's party.
// He gave you a list of integers of all the party goers.
// Arthur needs you to return true if he needs to invite more women or false if he is all set.

fun main() {
    inviteMoreWomen(listOf(1, -1, 1)) // true
    inviteMoreWomen(listOf(-1, -1, -1)) // false
    inviteMoreWomen(listOf(1, -1)) // false
    inviteMoreWomen(listOf(1, 1, 1)) // true
}

fun inviteMoreWomen(l: List<Int>) = l.sum() > 0

// done in 5 minutes
