# desafio-github-search
Criando um App Android para compartilhar seu portfolio de projeto

Criar um App Android simples que armazene um usuário do GitHub (informado em uma tela inicial) e liste todos os seus repositórios públicos. Garanta que o nome do usuário seja salvo e o App tenha a capacidade de redefinir essa informação.

![image](https://user-images.githubusercontent.com/5827265/188474294-4472bcc0-24ee-4ccd-80a8-7cee0372e7fa.png)


##  Dependencias

    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

## Permissões
Adicionado permissão de uso internet

    <uses-permission android:name="android.permission.INTERNET" />
## Código refatorado

No desafio o aplicativo estava usando ``findViewById`` para ter acesso ao elementos do layout, alterei o código para usar ``bindid`` com isso não foi preciso usar o metodo findViewById para encontrar e interagir com os elementos do layout.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   }
```
## Alteração código

```kotlin
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
   }
```
## Exemplo de uso de um elemento do layout

```kotlin
    private fun setupListeners() {
        //no codigo abaixo atraves do bindig tenho acesso ao elemento do layout.
        binding.btnConfirmar.setOnClickListener {
            saveUserLocal()
        }

    }
```

## Alteração no build.gradle do Modulo: App

Adicionado o código abaixo para utilizar o binding

```kotlin
    buildFeatures{
        viewBinding = true
    }
```
