programming funny quotes
=========
[![Contributors](https://img.shields.io/badge/contributors-1-46CC12)](#contributors-)
[![spring](https://img.shields.io/badge/Springboot-v3.3.5-5FA04E?logo=spring)](https://spring.io/projects/spring-boot)


## Description:

A simple api that returns a random funny fact about programming on a GET request

### Example Usage

<!-- ``` 
curl http://localhost:8080/getPhrase/random
``` -->

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


<details>
  <summary>Help us expand and improve Internationalization on this API  (Click to expand)</summary>
  <h3>Help us expand and improve Internationalization on this API</h3>
  
  <p><b>Note:</b> We are trying to follow the browser's language tags, which are formally defined in <a href="https://datatracker.ietf.org/doc/html/rfc5646">RFC 5646</a>, which rely on the <a href="https://en.wikipedia.org/wiki/ISO_639">ISO 639</a> standard (quite often the <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">639-1 code list</a>) for <a href="https://en.wikipedia.org/wiki/Language_code">language codes</a> to be used.</p> 

<p>We would love it if you helped this project by taking a look at our <a href="https://github.com/wh-iterabb-it/meowfacts/issues/175">Call for Contributors</a> to see if you can make a contribution that helps us be more inclusive and support more languages. </p>
</details>


<<<<<<< HEAD
### Dedication

<div align="center">
<p>This API serves up quirky quotes that programmers can’t debug away! </p>
  <img width="500" height="500" alt="my coding backpack in ASCII ART" src="./bkp_db/backpack_ascii.png" />
  <p>If you enjoy this api, or just love programming, please donate to:</p>
 [![pp](https://img.shields.io/badge/Donate-3775A9?logo=paypal)](https://www.paypal.com/paypalme/foferys)

</div>

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
