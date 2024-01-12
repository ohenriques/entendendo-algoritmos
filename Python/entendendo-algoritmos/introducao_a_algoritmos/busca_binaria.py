def pesquisa_binaria(lista, item):
    baixo = 0
    alto = len(lista) - 1

    while baixo <= alto:
        meio = (baixo + alto) // 2
        chute = lista[meio]
        if chute == item:
            return meio
        if chute > item:
            alto = meio - 1
        else:
            baixo = meio + 1
    return None


minha_lista = [1, 3, 4, 7, 9]
minha_lista2 = [1, 5, 8, 9, 10, 14, 19, 22, 26, 29, 30]

print(pesquisa_binaria(minha_lista, 4))
print(pesquisa_binaria(minha_lista2, 5))
print(pesquisa_binaria(minha_lista, -1))
print(pesquisa_binaria(minha_lista, 9))

# a pesquisa binária necessita que o array esteja ordenado, e ela fornece o indice do número que foi solicitado