# design-pattern-proxy
nous voulons fournir un acces controllé à une fonction ou un programme .

exemple : on a une commande à execétuer dans notre systeme. mais lorsque on va donner la commande à notre client , il peut supprimer ou impacter notre systeme par cette commande , donc va donner au client un acces controllé à cette commande.

exemple 2 : on peut utliser le proxy par exemple lorsqu'on va récuperer une image depuis notre disque dur la premiere fois , puis la deuxieme fois on recupêre l'image depuis le cache. donc on teste si c'est null l'image ou non, si non n'est null on la récupere depuis le cache


exemple 1 : implementation 

si le mot de passe incorrete 
![image](https://user-images.githubusercontent.com/36199753/151385387-8cf2306e-2359-48f4-809e-5669a610b4dc.png)

si le mot de passe est correcte
![image](https://user-images.githubusercontent.com/36199753/151385507-0f8b1117-85a8-4838-9fad-31ab1833d22c.png)


