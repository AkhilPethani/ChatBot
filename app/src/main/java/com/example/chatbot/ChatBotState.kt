package com.example.chatbot

sealed interface ChatBotUiState {
    data object Ideal: ChatBotUiState

    data object  Loading : ChatBotUiState

    data class Sucess ( val ChatData : String) : ChatBotUiState
    data class Error( val chatError : String) : ChatBotUiState
}