# Esercizio 2

## Utilizzare i comandi del sistema operativo per otterenere informazioni sulla rete

Eseguire i seguenti comandi e riportare i risultato in un file denominato __info-rete.md__ nella cartella __Work\Modulo1__ sul *Desktop*

- Utilizzare il comando __ipconfig__ per rilevare la configurazione dei propri dispositivi di rete; annotare sul file dei risultati le seguenti informazioni:
  - Indirizzo IP
  - Subnet mask
  - Indirizzo del Gateway
  - Indirizzo del server DNS
- Utilizzare il comando __ping__ per ottenere l'indirizzo fisico del server *www.github.com* annotare sul file dei risultati le seguenti informazioni:
  - Tempo medio, massimo e minimo di risposta
  - Indirizzo IP di destinazione
- Utilizzare il comando __tracert__ per rilevare l'attraversamento dei router verso il server *ww.github.com* annotare sul file dei risultati le seguenti informazioni:
  - Numero di router attraversati
  - Indirizzo IP del router più lento (il collo di bottiglia)
- Utilizzare il comando __nslookup__ per quali e quanti indirizzi IP sono risolti dal nome *www.github.com* annotare sul file dei risultati le seguenti informazioni:
  - Numero di diversi indirizzi IP di *www.github.com*
- Utilizzare il comando __nestat -a -b__ per elencare le porte aperte in ascolto (LISTENING). annotare sul file dei risultati le seguenti informazioni:
  - Numero dei servizi attivi in LISTENING con protocollo TCP e porta inferiore a 100
- Utilizzare il programma __Wireshark__ per catturare il traffico del comando __ping__ eseguito nel 2° punto di questo esercizio; annotare sul file dei risultati le seguenti informazioni:
  - Dimensione del Frame
  - Dimensione del payload