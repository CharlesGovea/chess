interface Piece {
    var name: String
    var color: Boolean
    var position: Position

    fun representation() {
        println("${name[0]}")
    }
}

class Queen : Piece {
    override var name: String = "Queen"
}

class King : Piece {
    override var name: String = "King"
}

class Knight : Piece {
    override var name: String = "knight"
}

class Bishop : Piece {
    override var name: String = "bishop"
}

class Pawn: Piece {
    override var name: String = "pawn"

    var promoted = false
    var promoteTo = Piece
    var movement
}