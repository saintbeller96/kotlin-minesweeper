package domain

import io.kotest.core.spec.style.DescribeSpec

class MatrixTest : DescribeSpec({

    // describe("행렬은") {
    //     val dimension = Dimension(5, 5)
    //
    //     it("차원의 넓이만큼 칸을 가진다") {
    //         val matrix = Matrix(dimension, NumberOfMines(1))
    //         matrix.cells.values.size shouldBe 25
    //     }
    //
    //     context("지뢰 개수가 주어지면") {
    //         val numberOfMines = NumberOfMines(5)
    //         it("그 수만큼 지뢰 칸을 배치한다") {
    //             val locationSelector = CustomLocationSelector(
    //                 locations(0 to 0, 1 to 1, 2 to 2, 3 to 3, 4 to 4)
    //             )
    //             val matrix = Matrix(dimension, numberOfMines, locationSelector)
    //             matrix.cells.values.count { it is Cell.Mine } shouldBe numberOfMines.value
    //         }
    //     }
    //
    //     it("지뢰 개수가 전체 칸 수보다 많을 수 없다") {
    //         val numberOfMines = NumberOfMines(26)
    //         shouldThrowExactly<IllegalArgumentException> {
    //             Matrix(dimension, numberOfMines)
    //         }
    //     }
    // }
})