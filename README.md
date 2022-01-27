# design-pattern-proxy
nous voulons fournir un acces controllé à une fonction ou un programme .

exemple : on a une commande à execétuer dans notre systeme. mais lorsque on va donner la commande à notre client , il peut supprimer ou impacter notre systeme par cette commande , donc va donner au client un acces controllé à cette commande.

exemple 2 : on peut utliser le proxy par exemple lorsqu'on va récuperer une image depuis notre disque dur la premiere fois , puis la deuxieme fois on recupêre l'image depuis le cache. donc on teste si c'est null l'image ou non, si non n'est null on la récupere depuis le cache


exemple 1 : implementation 
