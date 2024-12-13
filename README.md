programming funny quotes
=========
[![Contributors](https://img.shields.io/badge/contributors-1-46CC12)](#contributors-)
[![spring](https://img.shields.io/badge/Springboot-v3.3.5-5FA04E?logo=spring)](https://spring.io/projects/spring-boot)
[![mysql](https://img.shields.io/badge/Mysql-yellow?style=for-the-badge&logo=mysql&logoColor=000)](https://www.mysql.com/it/)

<a href="https://www.oracle.com/java/" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/skills/java-colored.svg" width="26" height="26" alt="Java" />
</a>
[![pp](https://img.shields.io/badge/Buy_me_a_coffee-3775A9?logo=paypal)](https://www.paypal.com/paypalme/foferys)


## Description:

A simple api that returns a random funny fact about programming on a GET request

### Example Usage

``` 
curl http://localhost:8080/getPhrase/random
```

Response

```json
{
    "data": {
        "id": 24,
        "phrase": "The first rule of debugging: Don’t make it worse.",
        "type": "generic"
    }
}
```


### Advanced Usage

<!-- You can request more than one funny fact at a time by using the GET param `count`

```bash
curl http://localhost:8080/getPhrase/random?count=3
```

Response

```json
{
  "data": [
    "0": 	"Mother cats teach their kittens to use the litter box.",
    "1": "A cat can sprint at about thirty-one miles per hour.",
    "2": "The worlds richest cat is worth $13 million after his human passed away and left her fortune to him."
  ]
}
``` -->

you can retrieve a list of quotes filtered by a specific type (backend, frontend, or generic).


```bash
curl http://localhost:8080/getPhrase/?type=backend  
```

Response

```json
{
    "data": [
        {
            "id": 1,
            "phrase": "Backend developers always say, 'It worked on my local server.'",
            "type": "backend"
        },
        {
            "id": 4,
            "phrase": "Backend developers don’t fear downtime; they fear 'urgent deployments.'",
            "type": "backend"
        }
    ]
}

```

### Dedication

<div align="center">
<p>This API serves up quirky quotes that programmers can’t debug away! </p>
  <img width="500" height="500" alt="my coding backpack in ASCII ART" src="./bkp_db/backpack_ascii.png" />
  <p>If you enjoy this api, or just love programming, please donate to:</p>
</div>

[![pp](https://img.shields.io/badge/Donate-3775A9?logo=paypal)](https://www.paypal.com/paypalme/foferys)

## Contributors ✨ 
[![](https://img.shields.io/badge/contributors-1-46CC12)](# "Contributors")

<!-- Thanks goes to these wonderful people -->

<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/gianpieroferraro"><img src="https://avatars.githubusercontent.com/u/123701797?v=4" width="100px;" alt="Gianpiero Ferraro"/><br /><sub><b>Gianpiero Ferraro</b>(always me lol)</sub></a><br />
      </td>
    </tr>
</tbody>
</table>
