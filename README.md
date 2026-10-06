# 🧊 Simulado: <br>Monitoramento de Neutrinos no Observatório IceCube

## 📖 Contexto

O físico belga **Francis Halzen** foi laureado com o Prêmio Nobel de Física por seu trabalho no desenvolvimento do **Observatório de Neutrinos IceCube**, localizado no Polo Sul. 

O observatório utiliza $1\text{ km}^3$ de gelo antártico para capturar as chamadas **"partículas fantasma"** — neutrinos de altíssima energia originados de fenômenos violentos no universo distante. Como essas partículas atravessam a matéria sem deixar vestígios facilmente detectáveis, o IceCube conta com milhares de sensores óticos congelados no gelo para registrar suas raras interações.

Você foi encarregado de desenvolver o módulo inicial para processar e analisar as leituras de energia obtidas pelos sensores do observatório.

Fonte: https://www.bbc.com/portuguese/articles/c6kglr3wy2zgo
---

## 🎯 Objetivo

Escrever um programa em **Java** que processe e analise os dados de energia capturados por um conjunto de sensores durante um evento de detecção no IceCube.

---

## 📋 Requisitos do Programa

1. **Declaração do Vetor:**
   - Crie um vetor de números reais (`double[]`) com capacidade para **10 elementos**, denominado `energias`.
   - Cada posição representa o nível de energia (em Tera-eletronvolts, $\text{TeV}$) registrado por um sensor individual.

2. **Entrada de Dados:**
   - Solicite ao usuário a digitação dos valores de energia para cada um dos 10 sensores (índices `0` a `9`).

3. **Processamento e Análise:**
   - Calcule a **média de energia** registrada pelos 10 sensores.
   - Identifique o **maior valor de energia** capturado e determine o **índice (sensor)** correspondente.
   - Contabilize a **quantidade de sensores** que registraram eventos de *Altíssima Energia* (valores estritamente maiores que $100.0\text{ TeV}$).

4. **Saída de Dados:**
   - Exiba um relatório organizado contendo a média calculada, o maior pico com o índice do sensor e a contagem de eventos de altíssima energia.

---

## 📥 Exemplo de Entrada e Saída

### Entrada Esperada (via Console):
```text
=== SISTEMA DE MONITORAMENTO DE NEUTRINOS - ICECUBE ===
Informe os níveis de energia registrados (em TeV):

Sensor [0]: 12.5
Sensor [1]: 105.4
Sensor [2]: 45.0
Sensor [3]: 210.8
Sensor [4]: 3.2
Sensor [5]: 98.7
Sensor [6]: 150.0
Sensor [7]: 12.1
Sensor [8]: 88.3
Sensor [9]: 4.0
```

### Saída Esperada:
```text
=== RELATÓRIO DE DETECÇÃO DE PARTÍCULAS FANTASMA ===
Média de energia capturada: 72.99 TeV
Maior pico de energia: 210.80 TeV (registrado no Sensor [3])
Total de sensores com evento > 100 TeV: 3
```

---

## 🚀 Desafios Extra (Opcional)

- **Validação de Dados:** Impeça que o usuário insira valores negativos de energia (use um laço `do-while` na leitura).
- **Filtragem de Picos:** Crie um segundo vetor (`double[] picos`) para armazenar e exibir apenas as medições que ficaram acima da média calculada.
