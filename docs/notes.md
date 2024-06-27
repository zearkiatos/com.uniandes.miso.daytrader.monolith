# How to use mono2micro

1) Export mono2micro

```txt
$ export PATH=$PATH:/path/to/m2m-cli
```

2) Execute the next command

```txt
$ mono2micro install -c docker
```

# Add BlueJay

```txt
$ docker run --platform linux/arm64 -e LICENSE=accept --rm -it -v /Users/pedrocapriles/Documents/projects/java:/var/application ibmcom/mono2micro-bluejay /var/application/com.uniandes.miso.daytrader.monolith
```