# Currency Converter

The following java executable consists currency translator from around the world that at the beginning shows a menu of currencies that you want to convert and then gives you the option to choose which currency you want to convert it to, prior to this it shows a history management menu where you can see the history, delete elements of the history and even reset it.

## Features

- show a menu of 6 options like the following
```
Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : gyhuhi

Invalid format, try it again

	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 
```

- In the option Convert currency the following menu is displayed

```
	Currencies Menu
---------------------------------------------------------------------
|1 . Colombian Peso         |2 . United Arab Emirates Dirham        |
---------------------------------------------------------------------
|3 . Albanian Lek            |4 . Armenian Dram                     |
---------------------------------------------------------------------
|5 . Netherlands Antillean Guilder     |6 . Angolan Kwanza          |
---------------------------------------------------------------------
|7 . Argentine Peso   |8 . Australian Dollar   |9 . Aruban Florin   |
---------------------------------------------------------------------
|10 . Azerbaijani Manat      |11 . Bosnia and Herzegovina Mark      |
---------------------------------------------------------------------
|12 . Barbadian dollar      |13 . Bangladeshi Taka   |14 . Lev      |
---------------------------------------------------------------------
|15 . Bahraini Dinar   |16 . Burundian Franc  |17 . Bermuda Dollar  |
---------------------------------------------------------------------
|18 . Brunei Dollar     |19 . Bolivian     |20 . Brazilian Real     |
---------------------------------------------------------------------
|21 . Bahamian Dollar      |22 . Indian Rupee      |23 . Pula       |
---------------------------------------------------------------------
|24 . New Belarusian Ruble|25 . Belizean Dollar|26 . Canadian Dollar|
---------------------------------------------------------------------
|27 . Congolese Franc     |28 . Swiss Franc    |29 . Chilean Peso   |
---------------------------------------------------------------------
|30 . Renminbi    |31 . Costa Rican Colon      |32 . Cuban Peso     |
---------------------------------------------------------------------
|33 . Cape Verdean Coat of Arms|34. Czech Crown |35 . Djibouti Franc|
---------------------------------------------------------------------
|36 . Danish Crown   |37 . Dominican Peso   |38 . Algerian dinar    |
---------------------------------------------------------------------
|39 . Egyptian Pound  |40 . Nakfa|41 . Ethiopian Birr  |42 . Euro   |
---------------------------------------------------------------------
|43 . Fijian Dollar |44 . Falkland Islands Pound |45. Faroese Crown |
---------------------------------------------------------------------
|46 . Pound Sterling   |47 . Georgian Lari   |48 . Gurnsey Pounds   |
---------------------------------------------------------------------
|49 . Cedi       |50 . Gibraltarian Pound        |51 . Dalasi       |
---------------------------------------------------------------------
|52 . Guinean Franc    |53 . Quetzal    |54 . Guyanaese Dollar      |
---------------------------------------------------------------------
|55 . Hong Kong dollar |56 . Honduran Lempira |57 . Croatian Kuna   |
---------------------------------------------------------------------
|58 . Gourde    |59 . Hungarian Forint    |60 . Indonesian Rupiah   |
---------------------------------------------------------------------
|61 . Nuevo séquel  |62 . Isle of Man Pound   |63 . Indian Rupee    |
---------------------------------------------------------------------
|64 . Raqi Dinar     |65 . Iranian Rial    |66 . Icelandic Crown    |
---------------------------------------------------------------------
|67 . Jersey Pound  |68 . Jamaican Dollar   |69 . Jordanian Dinar   |
---------------------------------------------------------------------
|70 . Japanese Yen    |71 . Kenyan Shilling     | 72 . Kyrgyz Som   |
---------------------------------------------------------------------
|73 . Cambodian Riel|74 . Cayman Islands Dollar|75 . Comorian Franc |
---------------------------------------------------------------------
|76 . South Korean Won              |77 . Dinar Kuwaití             |
---------------------------------------------------------------------
|78 . Afghani Afghani       |79 . Tenge Kazajo    |80 . Lao Kip     |
---------------------------------------------------------------------
|81 . Lebanese pound  |82 . Sri Lanka rupee  |83 . Liberian Dollar  |
---------------------------------------------------------------------
|84 . Loti     |85 . Libyan dinar        |86 . Moroccan dirham      |
---------------------------------------------------------------------
|87 . Moldovan Leu   |88 . Malagasy Ariary   |89 . Macedonian Denar |
---------------------------------------------------------------------
|90 . Burmese Kyat  |91 . Mongolian Tugrik  |92 . Macanese Pataca   |
---------------------------------------------------------------------
|93 . Ouguiya    |94 . Mauritian Rupee     |95 . Maldivian Rupee    |
---------------------------------------------------------------------
|96 . Malawi Kwacha   |97 . Mexican Peso   |98 . Malaysian Ringgit  |
---------------------------------------------------------------------
|99 . Mozambican metical  |100 .  Namibian dollar   |101 . Naira    |
---------------------------------------------------------------------
|102 . Cordova  |103 . The Norwegian Crown  |104 . Nepalese Rupee   |
---------------------------------------------------------------------
|105 . New Zealand Dollar|106 . Rial|107 . Balboa|108 . Peruvian Sun|
---------------------------------------------------------------------
|109 . Kina    |110 . Philippine Peso     |111 . Rupia Pakistaní    |
---------------------------------------------------------------------
|112 . Złoty   |113 . Paraguayan Guarani     |114 . Qatari Riyal    |
---------------------------------------------------------------------
|115 . Romanian Leu  |116 . Serbian Dinar   |117 . Russian Ruble    |
---------------------------------------------------------------------
|118 . Malaysian Ringgit             |119 . Saudi Riyal             |
---------------------------------------------------------------------
|120 . Solomon Islands Dollar         |121 . Seychelles Rupee       |
---------------------------------------------------------------------
|122 . Sudanese Pound |123 . Swedish Crown |124 . Singapore Dollar  |
---------------------------------------------------------------------
|125 . Saint Helena Pound       |126 . Leone      |127 . Leone      |
---------------------------------------------------------------------
|128 . Somali Shilling           |129 . Surinamese Dollar           |
---------------------------------------------------------------------
|130 . South Sudanese Pound           |131 . Sao Tomean Dobra       |
---------------------------------------------------------------------
|132 . Solomon Islands dollar   |133 . Lilangeni   |134 . Thai Baht |
---------------------------------------------------------------------
|135 . Tajik Somoni  |136 . Turkmen Manat   |137 . Tunisian Dinar   |
---------------------------------------------------------------------
|138 . Kuwaiti Dinar  |139 . Turkish Lira  |140 . Trinidad dollar   |
---------------------------------------------------------------------
|141 . Tuvaluan Dollar             |142 . New Taiwan Dollar         |
---------------------------------------------------------------------
|143 . Tanzanian Shilling  |144 . Hryvnia  |145 . Ugandan Shilling  |
---------------------------------------------------------------------
|146 . Dólar Estadounidense  |147 . Uruguayan Peso |148 . Uzbek Som |
---------------------------------------------------------------------
|149 . Bolivar   |150 . Vietnamese Đồng  |151 . Vatu  |152 . Tālā   |
---------------------------------------------------------------------
|153 . Central African CFA Franc   |154 . East Caribbean Dollar     |
---------------------------------------------------------------------
|155 . XDR     |156 . West African CFA Franc     |157 . CFP Franc   |
---------------------------------------------------------------------
|158 . Rial Yemení |159 . South African Rand |160 . Zambian Kwacha  |
---------------------------------------------------------------------
|161 . Zimbabwe Dollar|
-----------------------

	What currency do you want to convert (Enter -1 to exit)?
Enter an option : -1

	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 1

	Currencies Menu
---------------------------------------------------------------------
|1 . Colombian Peso         |2 . United Arab Emirates Dirham        |
---------------------------------------------------------------------
|3 . Albanian Lek            |4 . Armenian Dram                     |
---------------------------------------------------------------------
|5 . Netherlands Antillean Guilder     |6 . Angolan Kwanza          |
---------------------------------------------------------------------
|7 . Argentine Peso   |8 . Australian Dollar   |9 . Aruban Florin   |
---------------------------------------------------------------------
|10 . Azerbaijani Manat      |11 . Bosnia and Herzegovina Mark      |
---------------------------------------------------------------------
|12 . Barbadian dollar      |13 . Bangladeshi Taka   |14 . Lev      |
---------------------------------------------------------------------
|15 . Bahraini Dinar   |16 . Burundian Franc  |17 . Bermuda Dollar  |
---------------------------------------------------------------------
|18 . Brunei Dollar     |19 . Bolivian     |20 . Brazilian Real     |
---------------------------------------------------------------------
|21 . Bahamian Dollar      |22 . Indian Rupee      |23 . Pula       |
---------------------------------------------------------------------
|24 . New Belarusian Ruble|25 . Belizean Dollar|26 . Canadian Dollar|
---------------------------------------------------------------------
|27 . Congolese Franc     |28 . Swiss Franc    |29 . Chilean Peso   |
---------------------------------------------------------------------
|30 . Renminbi    |31 . Costa Rican Colon      |32 . Cuban Peso     |
---------------------------------------------------------------------
|33 . Cape Verdean Coat of Arms|34. Czech Crown |35 . Djibouti Franc|
---------------------------------------------------------------------
|36 . Danish Crown   |37 . Dominican Peso   |38 . Algerian dinar    |
---------------------------------------------------------------------
|39 . Egyptian Pound  |40 . Nakfa|41 . Ethiopian Birr  |42 . Euro   |
---------------------------------------------------------------------
|43 . Fijian Dollar |44 . Falkland Islands Pound |45. Faroese Crown |
---------------------------------------------------------------------
|46 . Pound Sterling   |47 . Georgian Lari   |48 . Gurnsey Pounds   |
---------------------------------------------------------------------
|49 . Cedi       |50 . Gibraltarian Pound        |51 . Dalasi       |
---------------------------------------------------------------------
|52 . Guinean Franc    |53 . Quetzal    |54 . Guyanaese Dollar      |
---------------------------------------------------------------------
|55 . Hong Kong dollar |56 . Honduran Lempira |57 . Croatian Kuna   |
---------------------------------------------------------------------
|58 . Gourde    |59 . Hungarian Forint    |60 . Indonesian Rupiah   |
---------------------------------------------------------------------
|61 . Nuevo séquel  |62 . Isle of Man Pound   |63 . Indian Rupee    |
---------------------------------------------------------------------
|64 . Raqi Dinar     |65 . Iranian Rial    |66 . Icelandic Crown    |
---------------------------------------------------------------------
|67 . Jersey Pound  |68 . Jamaican Dollar   |69 . Jordanian Dinar   |
---------------------------------------------------------------------
|70 . Japanese Yen    |71 . Kenyan Shilling     | 72 . Kyrgyz Som   |
---------------------------------------------------------------------
|73 . Cambodian Riel|74 . Cayman Islands Dollar|75 . Comorian Franc |
---------------------------------------------------------------------
|76 . South Korean Won              |77 . Dinar Kuwaití             |
---------------------------------------------------------------------
|78 . Afghani Afghani       |79 . Tenge Kazajo    |80 . Lao Kip     |
---------------------------------------------------------------------
|81 . Lebanese pound  |82 . Sri Lanka rupee  |83 . Liberian Dollar  |
---------------------------------------------------------------------
|84 . Loti     |85 . Libyan dinar        |86 . Moroccan dirham      |
---------------------------------------------------------------------
|87 . Moldovan Leu   |88 . Malagasy Ariary   |89 . Macedonian Denar |
---------------------------------------------------------------------
|90 . Burmese Kyat  |91 . Mongolian Tugrik  |92 . Macanese Pataca   |
---------------------------------------------------------------------
|93 . Ouguiya    |94 . Mauritian Rupee     |95 . Maldivian Rupee    |
---------------------------------------------------------------------
|96 . Malawi Kwacha   |97 . Mexican Peso   |98 . Malaysian Ringgit  |
---------------------------------------------------------------------
|99 . Mozambican metical  |100 .  Namibian dollar   |101 . Naira    |
---------------------------------------------------------------------
|102 . Cordova  |103 . The Norwegian Crown  |104 . Nepalese Rupee   |
---------------------------------------------------------------------
|105 . New Zealand Dollar|106 . Rial|107 . Balboa|108 . Peruvian Sun|
---------------------------------------------------------------------
|109 . Kina    |110 . Philippine Peso     |111 . Rupia Pakistaní    |
---------------------------------------------------------------------
|112 . Złoty   |113 . Paraguayan Guarani     |114 . Qatari Riyal    |
---------------------------------------------------------------------
|115 . Romanian Leu  |116 . Serbian Dinar   |117 . Russian Ruble    |
---------------------------------------------------------------------
|118 . Malaysian Ringgit             |119 . Saudi Riyal             |
---------------------------------------------------------------------
|120 . Solomon Islands Dollar         |121 . Seychelles Rupee       |
---------------------------------------------------------------------
|122 . Sudanese Pound |123 . Swedish Crown |124 . Singapore Dollar  |
---------------------------------------------------------------------
|125 . Saint Helena Pound       |126 . Leone      |127 . Leone      |
---------------------------------------------------------------------
|128 . Somali Shilling           |129 . Surinamese Dollar           |
---------------------------------------------------------------------
|130 . South Sudanese Pound           |131 . Sao Tomean Dobra       |
---------------------------------------------------------------------
|132 . Solomon Islands dollar   |133 . Lilangeni   |134 . Thai Baht |
---------------------------------------------------------------------
|135 . Tajik Somoni  |136 . Turkmen Manat   |137 . Tunisian Dinar   |
---------------------------------------------------------------------
|138 . Kuwaiti Dinar  |139 . Turkish Lira  |140 . Trinidad dollar   |
---------------------------------------------------------------------
|141 . Tuvaluan Dollar             |142 . New Taiwan Dollar         |
---------------------------------------------------------------------
|143 . Tanzanian Shilling  |144 . Hryvnia  |145 . Ugandan Shilling  |
---------------------------------------------------------------------
|146 . Dólar Estadounidense  |147 . Uruguayan Peso |148 . Uzbek Som |
---------------------------------------------------------------------
|149 . Bolivar   |150 . Vietnamese Đồng  |151 . Vatu  |152 . Tālā   |
---------------------------------------------------------------------
|153 . Central African CFA Franc   |154 . East Caribbean Dollar     |
---------------------------------------------------------------------
|155 . XDR     |156 . West African CFA Franc     |157 . CFP Franc   |
---------------------------------------------------------------------
|158 . Rial Yemení |159 . South African Rand |160 . Zambian Kwacha  |
---------------------------------------------------------------------
|161 . Zimbabwe Dollar|
-----------------------

	What currency do you want to convert (Enter -1 to exit)?
Enter an option : yuhfyu
Invalid format
Do you wish to try it again (Enter Yes or No)? : yes
	What currency do you want to convert (Enter -1 to exit)?
Enter an option : 45

	Currencies Menu
---------------------------------------------------------------------
|1 . Colombian Peso         |2 . United Arab Emirates Dirham        |
---------------------------------------------------------------------
|3 . Albanian Lek            |4 . Armenian Dram                     |
---------------------------------------------------------------------
|5 . Netherlands Antillean Guilder     |6 . Angolan Kwanza          |
---------------------------------------------------------------------
|7 . Argentine Peso   |8 . Australian Dollar   |9 . Aruban Florin   |
---------------------------------------------------------------------
|10 . Azerbaijani Manat      |11 . Bosnia and Herzegovina Mark      |
---------------------------------------------------------------------
|12 . Barbadian dollar      |13 . Bangladeshi Taka   |14 . Lev      |
---------------------------------------------------------------------
|15 . Bahraini Dinar   |16 . Burundian Franc  |17 . Bermuda Dollar  |
---------------------------------------------------------------------
|18 . Brunei Dollar     |19 . Bolivian     |20 . Brazilian Real     |
---------------------------------------------------------------------
|21 . Bahamian Dollar      |22 . Indian Rupee      |23 . Pula       |
---------------------------------------------------------------------
|24 . New Belarusian Ruble|25 . Belizean Dollar|26 . Canadian Dollar|
---------------------------------------------------------------------
|27 . Congolese Franc     |28 . Swiss Franc    |29 . Chilean Peso   |
---------------------------------------------------------------------
|30 . Renminbi    |31 . Costa Rican Colon      |32 . Cuban Peso     |
---------------------------------------------------------------------
|33 . Cape Verdean Coat of Arms|34. Czech Crown |35 . Djibouti Franc|
---------------------------------------------------------------------
|36 . Danish Crown   |37 . Dominican Peso   |38 . Algerian dinar    |
---------------------------------------------------------------------
|39 . Egyptian Pound  |40 . Nakfa|41 . Ethiopian Birr  |42 . Euro   |
---------------------------------------------------------------------
|43 . Fijian Dollar |44 . Falkland Islands Pound |45. Faroese Crown |
---------------------------------------------------------------------
|46 . Pound Sterling   |47 . Georgian Lari   |48 . Gurnsey Pounds   |
---------------------------------------------------------------------
|49 . Cedi       |50 . Gibraltarian Pound        |51 . Dalasi       |
---------------------------------------------------------------------
|52 . Guinean Franc    |53 . Quetzal    |54 . Guyanaese Dollar      |
---------------------------------------------------------------------
|55 . Hong Kong dollar |56 . Honduran Lempira |57 . Croatian Kuna   |
---------------------------------------------------------------------
|58 . Gourde    |59 . Hungarian Forint    |60 . Indonesian Rupiah   |
---------------------------------------------------------------------
|61 . Nuevo séquel  |62 . Isle of Man Pound   |63 . Indian Rupee    |
---------------------------------------------------------------------
|64 . Raqi Dinar     |65 . Iranian Rial    |66 . Icelandic Crown    |
---------------------------------------------------------------------
|67 . Jersey Pound  |68 . Jamaican Dollar   |69 . Jordanian Dinar   |
---------------------------------------------------------------------
|70 . Japanese Yen    |71 . Kenyan Shilling     | 72 . Kyrgyz Som   |
---------------------------------------------------------------------
|73 . Cambodian Riel|74 . Cayman Islands Dollar|75 . Comorian Franc |
---------------------------------------------------------------------
|76 . South Korean Won              |77 . Dinar Kuwaití             |
---------------------------------------------------------------------
|78 . Afghani Afghani       |79 . Tenge Kazajo    |80 . Lao Kip     |
---------------------------------------------------------------------
|81 . Lebanese pound  |82 . Sri Lanka rupee  |83 . Liberian Dollar  |
---------------------------------------------------------------------
|84 . Loti     |85 . Libyan dinar        |86 . Moroccan dirham      |
---------------------------------------------------------------------
|87 . Moldovan Leu   |88 . Malagasy Ariary   |89 . Macedonian Denar |
---------------------------------------------------------------------
|90 . Burmese Kyat  |91 . Mongolian Tugrik  |92 . Macanese Pataca   |
---------------------------------------------------------------------
|93 . Ouguiya    |94 . Mauritian Rupee     |95 . Maldivian Rupee    |
---------------------------------------------------------------------
|96 . Malawi Kwacha   |97 . Mexican Peso   |98 . Malaysian Ringgit  |
---------------------------------------------------------------------
|99 . Mozambican metical  |100 .  Namibian dollar   |101 . Naira    |
---------------------------------------------------------------------
|102 . Cordova  |103 . The Norwegian Crown  |104 . Nepalese Rupee   |
---------------------------------------------------------------------
|105 . New Zealand Dollar|106 . Rial|107 . Balboa|108 . Peruvian Sun|
---------------------------------------------------------------------
|109 . Kina    |110 . Philippine Peso     |111 . Rupia Pakistaní    |
---------------------------------------------------------------------
|112 . Złoty   |113 . Paraguayan Guarani     |114 . Qatari Riyal    |
---------------------------------------------------------------------
|115 . Romanian Leu  |116 . Serbian Dinar   |117 . Russian Ruble    |
---------------------------------------------------------------------
|118 . Malaysian Ringgit             |119 . Saudi Riyal             |
---------------------------------------------------------------------
|120 . Solomon Islands Dollar         |121 . Seychelles Rupee       |
---------------------------------------------------------------------
|122 . Sudanese Pound |123 . Swedish Crown |124 . Singapore Dollar  |
---------------------------------------------------------------------
|125 . Saint Helena Pound       |126 . Leone      |127 . Leone      |
---------------------------------------------------------------------
|128 . Somali Shilling           |129 . Surinamese Dollar           |
---------------------------------------------------------------------
|130 . South Sudanese Pound           |131 . Sao Tomean Dobra       |
---------------------------------------------------------------------
|132 . Solomon Islands dollar   |133 . Lilangeni   |134 . Thai Baht |
---------------------------------------------------------------------
|135 . Tajik Somoni  |136 . Turkmen Manat   |137 . Tunisian Dinar   |
---------------------------------------------------------------------
|138 . Kuwaiti Dinar  |139 . Turkish Lira  |140 . Trinidad dollar   |
---------------------------------------------------------------------
|141 . Tuvaluan Dollar             |142 . New Taiwan Dollar         |
---------------------------------------------------------------------
|143 . Tanzanian Shilling  |144 . Hryvnia  |145 . Ugandan Shilling  |
---------------------------------------------------------------------
|146 . Dólar Estadounidense  |147 . Uruguayan Peso |148 . Uzbek Som |
---------------------------------------------------------------------
|149 . Bolivar   |150 . Vietnamese Đồng  |151 . Vatu  |152 . Tālā   |
---------------------------------------------------------------------
|153 . Central African CFA Franc   |154 . East Caribbean Dollar     |
---------------------------------------------------------------------
|155 . XDR     |156 . West African CFA Franc     |157 . CFP Franc   |
---------------------------------------------------------------------
|158 . Rial Yemení |159 . South African Rand |160 . Zambian Kwacha  |
---------------------------------------------------------------------
|161 . Zimbabwe Dollar|
-----------------------

	What currency do you want to convert it to (Enter -1 to exit)?
Enter an option : 123

Enter the quantity of Faroese Crown that you want to convert : $1200

Conversion Result : 1200.0 Faroese Crown (FOK) are equivalent to 1876.08 Swedish Crown (SEK)

Do you wish to convert another currency (Enter Yes or No)? : yeS

	Currencies Menu
---------------------------------------------------------------------
|1 . Colombian Peso         |2 . United Arab Emirates Dirham        |
---------------------------------------------------------------------
|3 . Albanian Lek            |4 . Armenian Dram                     |
---------------------------------------------------------------------
|5 . Netherlands Antillean Guilder     |6 . Angolan Kwanza          |
---------------------------------------------------------------------
|7 . Argentine Peso   |8 . Australian Dollar   |9 . Aruban Florin   |
---------------------------------------------------------------------
|10 . Azerbaijani Manat      |11 . Bosnia and Herzegovina Mark      |
---------------------------------------------------------------------
|12 . Barbadian dollar      |13 . Bangladeshi Taka   |14 . Lev      |
---------------------------------------------------------------------
|15 . Bahraini Dinar   |16 . Burundian Franc  |17 . Bermuda Dollar  |
---------------------------------------------------------------------
|18 . Brunei Dollar     |19 . Bolivian     |20 . Brazilian Real     |
---------------------------------------------------------------------
|21 . Bahamian Dollar      |22 . Indian Rupee      |23 . Pula       |
---------------------------------------------------------------------
|24 . New Belarusian Ruble|25 . Belizean Dollar|26 . Canadian Dollar|
---------------------------------------------------------------------
|27 . Congolese Franc     |28 . Swiss Franc    |29 . Chilean Peso   |
---------------------------------------------------------------------
|30 . Renminbi    |31 . Costa Rican Colon      |32 . Cuban Peso     |
---------------------------------------------------------------------
|33 . Cape Verdean Coat of Arms|34. Czech Crown |35 . Djibouti Franc|
---------------------------------------------------------------------
|36 . Danish Crown   |37 . Dominican Peso   |38 . Algerian dinar    |
---------------------------------------------------------------------
|39 . Egyptian Pound  |40 . Nakfa|41 . Ethiopian Birr  |42 . Euro   |
---------------------------------------------------------------------
|43 . Fijian Dollar |44 . Falkland Islands Pound |45. Faroese Crown |
---------------------------------------------------------------------
|46 . Pound Sterling   |47 . Georgian Lari   |48 . Gurnsey Pounds   |
---------------------------------------------------------------------
|49 . Cedi       |50 . Gibraltarian Pound        |51 . Dalasi       |
---------------------------------------------------------------------
|52 . Guinean Franc    |53 . Quetzal    |54 . Guyanaese Dollar      |
---------------------------------------------------------------------
|55 . Hong Kong dollar |56 . Honduran Lempira |57 . Croatian Kuna   |
---------------------------------------------------------------------
|58 . Gourde    |59 . Hungarian Forint    |60 . Indonesian Rupiah   |
---------------------------------------------------------------------
|61 . Nuevo séquel  |62 . Isle of Man Pound   |63 . Indian Rupee    |
---------------------------------------------------------------------
|64 . Raqi Dinar     |65 . Iranian Rial    |66 . Icelandic Crown    |
---------------------------------------------------------------------
|67 . Jersey Pound  |68 . Jamaican Dollar   |69 . Jordanian Dinar   |
---------------------------------------------------------------------
|70 . Japanese Yen    |71 . Kenyan Shilling     | 72 . Kyrgyz Som   |
---------------------------------------------------------------------
|73 . Cambodian Riel|74 . Cayman Islands Dollar|75 . Comorian Franc |
---------------------------------------------------------------------
|76 . South Korean Won              |77 . Dinar Kuwaití             |
---------------------------------------------------------------------
|78 . Afghani Afghani       |79 . Tenge Kazajo    |80 . Lao Kip     |
---------------------------------------------------------------------
|81 . Lebanese pound  |82 . Sri Lanka rupee  |83 . Liberian Dollar  |
---------------------------------------------------------------------
|84 . Loti     |85 . Libyan dinar        |86 . Moroccan dirham      |
---------------------------------------------------------------------
|87 . Moldovan Leu   |88 . Malagasy Ariary   |89 . Macedonian Denar |
---------------------------------------------------------------------
|90 . Burmese Kyat  |91 . Mongolian Tugrik  |92 . Macanese Pataca   |
---------------------------------------------------------------------
|93 . Ouguiya    |94 . Mauritian Rupee     |95 . Maldivian Rupee    |
---------------------------------------------------------------------
|96 . Malawi Kwacha   |97 . Mexican Peso   |98 . Malaysian Ringgit  |
---------------------------------------------------------------------
|99 . Mozambican metical  |100 .  Namibian dollar   |101 . Naira    |
---------------------------------------------------------------------
|102 . Cordova  |103 . The Norwegian Crown  |104 . Nepalese Rupee   |
---------------------------------------------------------------------
|105 . New Zealand Dollar|106 . Rial|107 . Balboa|108 . Peruvian Sun|
---------------------------------------------------------------------
|109 . Kina    |110 . Philippine Peso     |111 . Rupia Pakistaní    |
---------------------------------------------------------------------
|112 . Złoty   |113 . Paraguayan Guarani     |114 . Qatari Riyal    |
---------------------------------------------------------------------
|115 . Romanian Leu  |116 . Serbian Dinar   |117 . Russian Ruble    |
---------------------------------------------------------------------
|118 . Malaysian Ringgit             |119 . Saudi Riyal             |
---------------------------------------------------------------------
|120 . Solomon Islands Dollar         |121 . Seychelles Rupee       |
---------------------------------------------------------------------
|122 . Sudanese Pound |123 . Swedish Crown |124 . Singapore Dollar  |
---------------------------------------------------------------------
|125 . Saint Helena Pound       |126 . Leone      |127 . Leone      |
---------------------------------------------------------------------
|128 . Somali Shilling           |129 . Surinamese Dollar           |
---------------------------------------------------------------------
|130 . South Sudanese Pound           |131 . Sao Tomean Dobra       |
---------------------------------------------------------------------
|132 . Solomon Islands dollar   |133 . Lilangeni   |134 . Thai Baht |
---------------------------------------------------------------------
|135 . Tajik Somoni  |136 . Turkmen Manat   |137 . Tunisian Dinar   |
---------------------------------------------------------------------
|138 . Kuwaiti Dinar  |139 . Turkish Lira  |140 . Trinidad dollar   |
---------------------------------------------------------------------
|141 . Tuvaluan Dollar             |142 . New Taiwan Dollar         |
---------------------------------------------------------------------
|143 . Tanzanian Shilling  |144 . Hryvnia  |145 . Ugandan Shilling  |
---------------------------------------------------------------------
|146 . Dólar Estadounidense  |147 . Uruguayan Peso |148 . Uzbek Som |
---------------------------------------------------------------------
|149 . Bolivar   |150 . Vietnamese Đồng  |151 . Vatu  |152 . Tālā   |
---------------------------------------------------------------------
|153 . Central African CFA Franc   |154 . East Caribbean Dollar     |
---------------------------------------------------------------------
|155 . XDR     |156 . West African CFA Franc     |157 . CFP Franc   |
---------------------------------------------------------------------
|158 . Rial Yemení |159 . South African Rand |160 . Zambian Kwacha  |
---------------------------------------------------------------------
|161 . Zimbabwe Dollar|
-----------------------

	What currency do you want to convert (Enter -1 to exit)?
Enter an option : 12

	Currencies Menu
---------------------------------------------------------------------
|1 . Colombian Peso         |2 . United Arab Emirates Dirham        |
---------------------------------------------------------------------
|3 . Albanian Lek            |4 . Armenian Dram                     |
---------------------------------------------------------------------
|5 . Netherlands Antillean Guilder     |6 . Angolan Kwanza          |
---------------------------------------------------------------------
|7 . Argentine Peso   |8 . Australian Dollar   |9 . Aruban Florin   |
---------------------------------------------------------------------
|10 . Azerbaijani Manat      |11 . Bosnia and Herzegovina Mark      |
---------------------------------------------------------------------
|12 . Barbadian dollar      |13 . Bangladeshi Taka   |14 . Lev      |
---------------------------------------------------------------------
|15 . Bahraini Dinar   |16 . Burundian Franc  |17 . Bermuda Dollar  |
---------------------------------------------------------------------
|18 . Brunei Dollar     |19 . Bolivian     |20 . Brazilian Real     |
---------------------------------------------------------------------
|21 . Bahamian Dollar      |22 . Indian Rupee      |23 . Pula       |
---------------------------------------------------------------------
|24 . New Belarusian Ruble|25 . Belizean Dollar|26 . Canadian Dollar|
---------------------------------------------------------------------
|27 . Congolese Franc     |28 . Swiss Franc    |29 . Chilean Peso   |
---------------------------------------------------------------------
|30 . Renminbi    |31 . Costa Rican Colon      |32 . Cuban Peso     |
---------------------------------------------------------------------
|33 . Cape Verdean Coat of Arms|34. Czech Crown |35 . Djibouti Franc|
---------------------------------------------------------------------
|36 . Danish Crown   |37 . Dominican Peso   |38 . Algerian dinar    |
---------------------------------------------------------------------
|39 . Egyptian Pound  |40 . Nakfa|41 . Ethiopian Birr  |42 . Euro   |
---------------------------------------------------------------------
|43 . Fijian Dollar |44 . Falkland Islands Pound |45. Faroese Crown |
---------------------------------------------------------------------
|46 . Pound Sterling   |47 . Georgian Lari   |48 . Gurnsey Pounds   |
---------------------------------------------------------------------
|49 . Cedi       |50 . Gibraltarian Pound        |51 . Dalasi       |
---------------------------------------------------------------------
|52 . Guinean Franc    |53 . Quetzal    |54 . Guyanaese Dollar      |
---------------------------------------------------------------------
|55 . Hong Kong dollar |56 . Honduran Lempira |57 . Croatian Kuna   |
---------------------------------------------------------------------
|58 . Gourde    |59 . Hungarian Forint    |60 . Indonesian Rupiah   |
---------------------------------------------------------------------
|61 . Nuevo séquel  |62 . Isle of Man Pound   |63 . Indian Rupee    |
---------------------------------------------------------------------
|64 . Raqi Dinar     |65 . Iranian Rial    |66 . Icelandic Crown    |
---------------------------------------------------------------------
|67 . Jersey Pound  |68 . Jamaican Dollar   |69 . Jordanian Dinar   |
---------------------------------------------------------------------
|70 . Japanese Yen    |71 . Kenyan Shilling     | 72 . Kyrgyz Som   |
---------------------------------------------------------------------
|73 . Cambodian Riel|74 . Cayman Islands Dollar|75 . Comorian Franc |
---------------------------------------------------------------------
|76 . South Korean Won              |77 . Dinar Kuwaití             |
---------------------------------------------------------------------
|78 . Afghani Afghani       |79 . Tenge Kazajo    |80 . Lao Kip     |
---------------------------------------------------------------------
|81 . Lebanese pound  |82 . Sri Lanka rupee  |83 . Liberian Dollar  |
---------------------------------------------------------------------
|84 . Loti     |85 . Libyan dinar        |86 . Moroccan dirham      |
---------------------------------------------------------------------
|87 . Moldovan Leu   |88 . Malagasy Ariary   |89 . Macedonian Denar |
---------------------------------------------------------------------
|90 . Burmese Kyat  |91 . Mongolian Tugrik  |92 . Macanese Pataca   |
---------------------------------------------------------------------
|93 . Ouguiya    |94 . Mauritian Rupee     |95 . Maldivian Rupee    |
---------------------------------------------------------------------
|96 . Malawi Kwacha   |97 . Mexican Peso   |98 . Malaysian Ringgit  |
---------------------------------------------------------------------
|99 . Mozambican metical  |100 .  Namibian dollar   |101 . Naira    |
---------------------------------------------------------------------
|102 . Cordova  |103 . The Norwegian Crown  |104 . Nepalese Rupee   |
---------------------------------------------------------------------
|105 . New Zealand Dollar|106 . Rial|107 . Balboa|108 . Peruvian Sun|
---------------------------------------------------------------------
|109 . Kina    |110 . Philippine Peso     |111 . Rupia Pakistaní    |
---------------------------------------------------------------------
|112 . Złoty   |113 . Paraguayan Guarani     |114 . Qatari Riyal    |
---------------------------------------------------------------------
|115 . Romanian Leu  |116 . Serbian Dinar   |117 . Russian Ruble    |
---------------------------------------------------------------------
|118 . Malaysian Ringgit             |119 . Saudi Riyal             |
---------------------------------------------------------------------
|120 . Solomon Islands Dollar         |121 . Seychelles Rupee       |
---------------------------------------------------------------------
|122 . Sudanese Pound |123 . Swedish Crown |124 . Singapore Dollar  |
---------------------------------------------------------------------
|125 . Saint Helena Pound       |126 . Leone      |127 . Leone      |
---------------------------------------------------------------------
|128 . Somali Shilling           |129 . Surinamese Dollar           |
---------------------------------------------------------------------
|130 . South Sudanese Pound           |131 . Sao Tomean Dobra       |
---------------------------------------------------------------------
|132 . Solomon Islands dollar   |133 . Lilangeni   |134 . Thai Baht |
---------------------------------------------------------------------
|135 . Tajik Somoni  |136 . Turkmen Manat   |137 . Tunisian Dinar   |
---------------------------------------------------------------------
|138 . Kuwaiti Dinar  |139 . Turkish Lira  |140 . Trinidad dollar   |
---------------------------------------------------------------------
|141 . Tuvaluan Dollar             |142 . New Taiwan Dollar         |
---------------------------------------------------------------------
|143 . Tanzanian Shilling  |144 . Hryvnia  |145 . Ugandan Shilling  |
---------------------------------------------------------------------
|146 . Dólar Estadounidense  |147 . Uruguayan Peso |148 . Uzbek Som |
---------------------------------------------------------------------
|149 . Bolivar   |150 . Vietnamese Đồng  |151 . Vatu  |152 . Tālā   |
---------------------------------------------------------------------
|153 . Central African CFA Franc   |154 . East Caribbean Dollar     |
---------------------------------------------------------------------
|155 . XDR     |156 . West African CFA Franc     |157 . CFP Franc   |
---------------------------------------------------------------------
|158 . Rial Yemení |159 . South African Rand |160 . Zambian Kwacha  |
---------------------------------------------------------------------
|161 . Zimbabwe Dollar|
-----------------------

	What currency do you want to convert it to (Enter -1 to exit)?
Enter an option : 87

Enter the quantity of Barbadian dollar that you want to convert : $12000

Conversion Result : 12000.0 Barbadian dollar (BBD) are equivalent to 106317.6 Moldovan Leu (MDL)

Do you wish to convert another currency (Enter Yes or No)? : nO

	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 
```

- shows the history of converted currencies and saved in a file.txt

```
	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 2

Conversion Result : 16002.0 (ZMW) are equivalent to 8026.6032000000005 (ZWL) => Fri, 03 May 2024 00:00:01 +0000
Conversion Result : 1200.0 (FOK) are equivalent to 1876.08 (SEK) => Fri, 03 May 2024 00:00:01 +0000
Conversion Result : 12000.0 (BBD) are equivalent to 106317.6 (MDL) => Fri, 03 May 2024 00:00:01 +0000

	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 
```

- Allows you to search for items in history

```
	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 3

Enter the element : AFN

There's not items that match with the search

	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 3

Enter the element : FOK

Items that match with the search
Conversion Result : 1200.0 (FOK) are equivalent to 1876.08 (SEK) => Fri, 03 May 2024 00:00:01 +0000

	Currency Convert
1 . Convert currency
2 . View history
3 . Search elements of the history
4 . Delete element of the history
5 . Reset history
6 . Exit
Enter an option : 
```