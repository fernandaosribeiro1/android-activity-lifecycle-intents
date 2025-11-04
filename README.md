# 📱 Android Core: Activity Lifecycle & Implicit Intents Demo

[![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

## 🌟 Visão Geral do Projeto

Este projeto é uma demonstração prática e concisa de dois pilares fundamentais do desenvolvimento Android: o Ciclo de Vida da Activity e o uso de Intents Implícitos.

O layout foi desenvolvido seguindo princípios modernos de UI/UX, utilizando `CardView` para elevação e um esquema de cores limpo e de alto contraste.

## 🎯 Objetivos Técnicos 

Este aplicativo foi desenvolvido para cumprir os seguintes requisitos técnicos:

### 1. Ciclo de Vida da Activity

O aplicativo demonstra o uso e a transição entre **três momentos distintos do ciclo de vida** da `MainActivity`.

* **Implementação:** Os métodos de callback (`onCreate`, `onStart`, `onPause`) foram sobrescritos.
* **Comprovação:** Cada transição é registrada no Logcat do Android Studio, permitindo a visualização da execução da Activity (exemplo: a chamada a `onPause` quando um Intent externo é acionado).

### 2. Intents Implícitos (Sem Troca de Tela Interna)

O projeto implementa o uso de **dois tipos de Intents** que iniciam ações do sistema operacional, sem navegar para uma Activity interna da aplicação.

* **Intent Tipo 1: Navegação Externa:** Utiliza `Intent.ACTION_VIEW` para solicitar ao sistema que abra uma URL em um navegador externo.
* **Intent Tipo 2: Compartilhamento de Dados:** Utiliza `Intent.ACTION_SEND` e `Intent.createChooser` para apresentar ao usuário uma lista de aplicativos disponíveis para compartilhamento de texto.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Kotlin
* **Design/UI:** ConstraintLayout e CardView (para elevação e cantos arredondados)
* **Ferramentas:** Logcat para observação do Ciclo de Vida.

## 🚀 Como Rodar o Projeto

1.  Clone este repositório:
    ```bash
    git clone [https://github.com/](https://github.com/)[SEU-USUARIO]/android-activity-lifecycle-intents.git
    ```
2.  Abra o projeto no Android Studio.
3.  Sincronize o projeto e compile (`Build > Make Project`).
4.  Execute o aplicativo em um emulador ou dispositivo físico.
5.  Para comprovar o Ciclo de Vida, abra o **Logcat** e filtre pela tag: `CicloDeVidaADO`.

## 🎨 Material Design e UI/UX

O design do aplicativo segue princípios do Material Design para criar uma experiência de usuário limpa e moderna:

* **Hierarquia Visual:** Uso de `CardView` com elevação sutil para destacar a área de conteúdo interativa.
* **Consistência:** Botões com largura total e margens consistentes para fácil interação.
* **Contraste:** Uso da cor **Verde** como cor primária de ação (CTA) para criar um contraste claro com o fundo branco e cinza.

---
