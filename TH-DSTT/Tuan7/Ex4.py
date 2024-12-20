import numpy as np
def gram_schmidt(A):
    M = np.zeros(A.shape)
    M[:,0] = A[:,0]
    for j in range(1,A.shape[1]):
        M[:,j] = A[:,j]
        for i in range(j):
            M[:,j] = M[:,j] - (sum(M[:,i]*A[:,j])/sum(A[:,j]*A[:,j]))*M[:,i]
    return M

# def gsBasis(A) :
#     B = np.array(A, dtype=np.float_)
#     for i in range(B.shape[1]) :
#         for j in range(i) :
#             B[:, i] = B[:, i] - B[:, i] @ B[:, j] * B[:, j]
#         if np.linalg.norm(B[:, i]) >1e-14:
#             B[:, i] = B[:, i] / np.linalg.norm(B[:, i])
#         else:
#             B[:, i] = np.zeros_like(B[:, i])
#     return B

# def gs_cofficient(v1, v2):
#     return np.dot(v2, v1) / np.dot(v1, v1)

# def multiply(cofficient, v):
#     return map((lambda x : x * cofficient), v)

# def proj(v1, v2):
#     return multiply(gs_cofficient(v1, v2) , v1)

# def gs(X):
#     Y = []
#     for i in range(len(X)):
#         temp_vec = X[i]
#         for inY in Y :
#             proj_vec = proj(inY, X[i])
#             temp_vec = map(lambda x, y : x - y, temp_vec, proj_vec)
#         Y.append(temp_vec)
#     return Y



u=np.array(
    [[-10 ,13, 7, -11],
     [2, 1, -5, 3],
     [-6, 3, 13, -3],
     [16, -16, -2, 5],
     [2, 1, -5, -7]])
print(gram_schmidt(u))
# print(gs(u))


