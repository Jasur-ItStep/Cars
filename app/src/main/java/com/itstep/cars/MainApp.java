package com.itstep.cars;

import android.app.Application;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainApp extends Application {
    public ArrayList<Car> getCarsList() {
        return carsList;
    }
    private final ArrayList<Car> carsList = new ArrayList<>();
    @Override
    public void onCreate() {
        super.onCreate();
        carsList.add(new Car(
            "Toyota",
            "Corolla",
                22000,
            "Introduced in 1966, the Corolla was the best-selling car worldwide by 1974 and has been one of the best-selling cars in the world since then. In 1997, the Corolla became the best-selling nameplate in the world, surpassing the Volkswagen Beetle.",
            2023,
            R.drawable.toyota_carolla
        ));
        carsList.add(new Car(
                "Ford",
                "Escape",
                28000,
                "The Ford Escape is a compact crossover SUV sold by Ford since the 2001 model year. The first Ford SUV derived from a car platform, the Escape was slotted below the Ford Explorer in size; the Escape is currently sized between the Ford EcoSport and Ford Edge. ",
                2023,
                R.drawable.ford_escape
        ));
        carsList.add(new Car(
                "Honda",
                "Accord",
                25000,
                "The Honda Accord (Japanese: ホンダ・アコード, Hepburn: Honda Akōdo, /əˈkɔːrd/), also known as the Honda Inspire (Japanese: ホンダ・インスパイア, Hepburn: Honda Insupaia) in Japan and China for certain generations, is a series of automobiles manufactured by Honda since 1976, best known for its four-door sedan variant, which has been one of the best-selling cars in the United States since 1989.",
                2022,
                R.drawable.honda_accord
        ));
        carsList.add(new Car(
                "Chevrolet",
                "Equinox",
                30000,
                "The Chevrolet Equinox is a crossover SUV introduced by Chevrolet in 2004 for the 2005 model year. It was intended to be a replacement for the North American Chevrolet Tracker and Chevrolet S-10 Blazer. The third-generation Equinox also replaced the first-generation Chevrolet Captiva.",
                2022,
                R.drawable.chevrolet_equinox
        ));
        carsList.add(new Car(
                "Nissan",
                "Altima",
                23000,
                "The Nissan Altima is a mid-size car manufactured by Nissan since 1992. It is a continuation of the Nissan Bluebird line, which began in 1955.",
                2021,
                R.drawable.nissan_altima
        ));
        carsList.add(new Car(
                "Hyundai",
                "Tucson",
                26000,
                "The Hyundai Tucson (Korean: 현대 투싼) (pronounced Tu-són) is a compact crossover SUV[1] produced by the South Korean manufacturer Hyundai since 2004. In the brand's lineup, the Tucson is positioned below the Santa Fe, and above the Kona and Creta. It is named after the city of Tucson, Arizona.",
                2023,
                R.drawable.hyundai_tucson
        ));
        carsList.add(new Car(
                "Volkswagen",
                "Jetta",
                24000,
                "The Volkswagen Jetta (listenⓘ) is a compact car/small family car manufactured and marketed by Volkswagen since 1979. Positioned to fill a sedan niche above the firm's Golf hatchback, it has been marketed over seven generations, variously as the Atlantic, Vento, Bora, City Jetta, Jetta City, GLI, Jetta, Clasico, and Sagitar (in China).",
                2021,
                R.drawable.volkswagen_jetta
        ));
        carsList.add(new Car(
                "Mazda",
                "CX-5",
                31000,
                "The Mazda CX-5 is a compact crossover SUV[1] produced by Mazda since 2012.[2] A successor to both the Tribute and the slightly larger CX-7,[3][4] it is Mazda's first model to feature the \"Kodo\" design language and the first model to be fully developed with a range of technologies branded as Skyactiv, including a rigid, lightweight platform combined with a series of engines and transmissions to reduce emissions and fuel consumption.",
                2021,
                R.drawable.mazda_cx5
        ));
        carsList.add(new Car(
                "Subaru",
                "Outback",
                27000,
                "The Subaru Outback is an automotive nameplate used by the Japanese automaker Subaru for two different SUV-themed vehicles: a Legacy-derived crossover station wagon, the Outback (1994–present, also sold as Legacy Outback (Japanese: スバル・レガシィアウトバック, Hepburn: Subaru Regashi Autobakku) in some markets), and an Impreza-derived off-road themed hatchback, the Outback Sport (1994–2011).",
                2023,
                R.drawable.subaru_outback
        ));
        carsList.add(new Car(
                "Kia",
                "Seltos",
                23000,
                "The Kia Seltos (Korean: 기아 셀토스) is a subcompact crossover SUV manufactured by Kia. Introduced in mid-2019, the Seltos is positioned between the smaller Stonic, Soul, or Sonet and the larger Sportage in Kia's global SUV lineup.",
                2022,
                R.drawable.kia_seltos
        ));
        carsList.add(new Car(
                "BMW",
                "X3",
                40000,
                "The BMW X3 is an SUV manufactured by BMW since 2003, based on the BMW 5 Series platform. Now in its third generation, BMW markets the car as a Sports Activity Vehicle, the company's proprietary descriptor for its X-line luxury vehicles.",
                2020,
                R.drawable.bmw_x3
        ));
        carsList.add(new Car(
                "Mercedes-Benz",
                "C-Class",
                45000,
                "The Mercedes-Benz C-Class is a series of compact executive cars produced by Mercedes-Benz Group AG. Introduced in 1993 as a replacement for the 190 (W201) range, the C-Class was the smallest model in the marque's line-up until the W168 A-Class arrived in 1997.",
                2018,
                R.drawable.mercedes_c_class
        ));
        carsList.add(new Car(
                "Audi",
                "Q5",
                42000,
                "The Audi Q5 is a series of compact luxury crossover SUVs produced by the German luxury car manufacturer Audi from 2008.[1] The original first-generation (Typ 8R) model was the third member of the B8 family to be released after the Audi A5 and fourth-generation A4, all being based on the Audi MLB platform. The second generation Q5 (Typ 80A) debuted in 2016 and shares the Audi MLB Evo platform with the corresponding B9 versions of the A4 and A5.",
                2017,
                R.drawable.audi_q5
        ));
        carsList.add(new Car(
                "Lexus",
                "RX",
                48000,
                "The Lexus RX (Japanese: レクサス・RX, Hepburn: Rekusasu RX) is a luxury crossover SUV sold since 1998 by Lexus, a luxury division of Toyota. Originally released in its home market of Japan in late 1997 as the Toyota Harrier, export sales began in March 1998 as the Lexus RX.",
                2017,
                R.drawable.lexus_rx
        ));

    }
}
