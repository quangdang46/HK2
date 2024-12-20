import numpy as np

A = np.array([[1, 1, 2], [3, 6, -5], [2, 4, -3]])
det_A = np.linalg.det(A)
print(det_A)
print(" Is A invertible?", "True" if det_A != 0 else "False")
B = np.array([1, -1, 0])
X = np.linalg.solve(A, B.T)
print(X)









#  Use Gaussian elimination method to find the solution of this linear system

# def gauss(A):
#     m = len(A)
#     assert all([len(row) == m + 1 for row in A[1:]]
#                ), "Matrix rows have non-uniform length"
#     n = m + 1

#     for k in range(m):
#         pivots = [abs(A[i][k]) for i in range(k, m)]
#         i_max = pivots.index(max(pivots)) + k

#         # Check for singular matrix
#         assert A[i_max][k] != 0, "Matrix is singular!"

#         # Swap rows
#         A[k], A[i_max] = A[i_max], A[k]

#         for i in range(k + 1, m):
#             f = A[i][k] / A[k][k]
#             for j in range(k + 1, n):
#                 A[i][j] -= A[k][j] * f

#             # Fill lower triangular matrix with zeros:
#             A[i][k] = 0

#     # Solve equation Ax=b for an upper triangular matrix A
#     x = []
#     for i in range(m - 1, -1, -1):
#         x.insert(0, A[i][m] / A[i][i])
#         for k in range(i - 1, -1, -1):
#             A[k][m] -= A[k][i] * x[0]
#     return x

# A=np.array([[1, 1, 2,1], [3, 6, -5,-1], [2, 4, -3,0]])
# print(gauss(A))
# # print(A)


