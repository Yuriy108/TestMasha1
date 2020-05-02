package com.example.testmasha;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<Question> questions;
    TextView quest, answer1, answer2, answer3, answer4;
    String writeAnwer;

    int count, result, qunt,start, carentQuest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        start = bundle.getInt("Start",0);
        qunt = bundle.getInt("Quntity",0);
        carentQuest=start;
        quest = findViewById(R.id.textviewQust);
        answer1 = findViewById(R.id.textviewanswer1);
        answer2 = findViewById(R.id.textviewanswer2);
        answer3 = findViewById(R.id.textviewanswer3);
        answer4 = findViewById(R.id.textviewanswer4);

        Question one = new Question("Частку НЕ потрібно писати разом з наступним словом у рядку", "не/покоїтися про сина", "ще не/завершена справа", "не/крутити носом", "досі не/прочитана книжка");
        Question two = new Question("Частку НЕ потрібно писати разом з наступним словом у рядку", "не/здужати задачу", "не/довиконувати план", "не/досконалий твір", "не/сила терпіти");
        Question three = new Question("Частку НЕ потрібно писати разом з наступним словом у рядку", "сказав дуже не/впевнено; давно не/здужає", "писав не/думаючи; розгулялася не/года", "зупинився не/випадково; ріка не/глибока", "ужити не/гайних заходів; не/треба чекати");
        Question fore = new Question("Частку НЕ потрібно писати разом з наступним словом у рядку", "надійти не/помітно; не/покоїтися про мене", "зробити не/обіцяючи; літати не/високо", "трапилося не/щастя; не/можна заздрити", "не/заважай працювати; не/зоране поле");
        Question five = new Question("Частку НЕ потрібно писати разом з наступним словом у реченні", "Глухий, що не/дочуює, то вигадає.", "Не/доведи, щоб розум задрімав.", "Не/доженеш конем, що запізниш одним днем.", "Печаль виховує мене, не/дорікає.");
        Question six = new Question("Частку НЕ потрібно писати окремо з наступним словом у реченні", "Де багато кухарів, там собаки не/голодні.", "Затужилося так в не/босводі.", "Не/зв'язаний сніп - солома.", "Лихий кухар або не/досолить, або пересолить.");
        Question seven = new Question("Частку НЕ потрібно писати окремо з наступним словом у реченні", "Соловей піснями не/ситий.", "Поспішно, та не/доладно.", "На вовка не/слава, а їсть овець Сава.", "Хоч мороз і прикіпає, зате комарів не/має");
        Question eight = new Question("Допущено помилку на правопис частки НЕ в рядку", "Тоді ще не знав я, що все проходить, все губиться в не впинній зміні подій.", "Я люблю тебе, друже, за те, що не можу тебе не любити.", "Коли-не-коли заходив до житників, щоб не дуже набридати.", "Ми не лукавили з тобою, ми просто йшли, у нас нема зерна неправди за собою.");
        Question nine = new Question("Частку НЕ потрібно писати окремо з наступним словом у реченні", "У польоті, ніким не.бачені, я спрямовую кораблі.", "Хай падають із неба зорі, немов не/зібране зерно.", "І довгий рікчекають марно рядки не/читаних книжок.", "Не/полоханий спокій над Києвом сонним дріма.");
        Question ten = new Question("НЕ вживаються без НЕ всі слова рядка", "небавом, небога, негідницький", "ненавидіти, небуття, невдаха", "нездара, нетерплячка, нещастя", "негода, неуважність, немовля");
        Question thirteen = new Question("Апостроф треба писати в усіх словах рядка", "в..юнитись, зап..ятсний, арф..р", "Примор..я, подвір..я, пор..ядок", "Р..єпін, прем..єр, солом..яний", "кар..єра, трав..яний, кр..якати");
        Question twelve = new Question("Апостроф треба писати в усіх словах рядка", "бур..янець, без..язикий, об..ємний", "пред..явник, пів..Європи, пів..яйця", "В..ячеслав, Св..ятослав, Валер..ян", "в..йокати, Лук..яніка, напівм..який");
        Question eleven = new Question("Апостроф треба писати в усіх словах рядка", "ум..ятина, знечі..я, харків..янин", "мр..яка, між..їздівський, реп..ях", "кам..яний, м..ясницф, горохв..яний", "сум..яття, недокрів..я, р..ябенький");
        Question fourteen = new Question("Апостроф треба писати в усіх словах рядка", "міжгір..я, голуб..я, зв..язковий", "мор..як, поголів..я, полум..яний", "подзв..якувати, п..яльця, верф..ю", "краков..як, міл..ярд, об..їздити");
        Question fifteen = new Question("Апостроф треба писати в усіх словах рядка", "Стеф..юк, Лук..янчук, Солов..яненко", "вітр..як, в..єтнамець, стерв..ятник", "бур..ячиння, крем..яний, прив..ялий", "в..язи, св..ятилище, сухом..ятка");
        Question sixteen = new Question("Апостроф треба писати в усіх словах рядка", "роз..ївся, хлоп..ятко, пів..ящика", "дріб..язковий, гр..ядка, любов..ю", "тр..юк, преджнив..яний, узгір..я", "темр..ява, валер..янка, Прип..ять");
        Question seventeen = new Question("Апостроф треба писати в усіх словах рядка", "різнотрав..я, пуп..янок, луб..яний", "дез..активація, гороб..ята, кров..ю", "безправ..я, без..іменний, п..янковий", "череп..я, обр..ядовість, зіп..ястись");
        Question eighteen = new Question("Апостроф треба писати в усіх словах рядка", "від..ємний, заозер..я, під..ярок", "роз..юшити, в..юн, гр..юкати", "кип..ятити, гар..ячий, пам..ять", "зав..язка, під..язиковий, бур..я");
        Question nineteen = new Question("Апостроф треба писати в усіх словах рядка", "з..ясувати, олов..яний, реп..ях", "вп..ятьох, цв..яшок, бур..янище", "багатослів..я, р..ядовий, плем..я", "бар..єр, плоскогір..я, бр..язкати");
        Question twenty = new Question("Апостроф треба писати в усіх словах рядка", "підгір..я, перемир..я, різнобарв..я", "Мар..янівка, п..ятдесят, кур..ятина", "брукв..яний, м..якшити, м..ясний", "плоскостоп..я, помор..янин, дуб..я");
        Question twenty1 = new Question("М'який знак на місці пропуску треба писати в усіх словах рядка", "вуз..кий, б'єт..ся, бад..орість, нян..чин", "біл..ше, Гуцул..щина, київс..кий, піс..ня", "л..отчик, їдал..ня, взірец.., Уман..щина", "Пол..ща, л..вівський, низ..кий, мен..ше");
        Question twenty2 = new Question("М'який знак на місці пропуску треба писати в усіх словах рядка", "винос..те, поділ..ський, заволз..кий", "волен..ці, камін..чик, навчаєт..ся", "карпатс..кий, слиз..кий, матусен..ці", "ошукан..ство, сяд..те, мадярс..кий");
        Question twenty3 = new Question("М'який знак на місці пропуску треба писати в усіх словах рядка", "піднос..ся, виріз..блений, людс..кість", "щиріс..ть, ковал..ський, війс..ковий", "розріс..ся, слов'янс..кий, брин..чати", "дитин..ці, товарис..кий, кишен..ці");
        Question twenty4 = new Question("М'який знак на місці пропуску треба писати в усіх словах рядка", "нян..чин, рибон..ці, кружал..це", "іранс..кий, сторонон..ці, мудрец..", "промін..ці, чотир..ох, Вас..ці", "облич.., тюр..ма, друкарен..");
        Question twenty5 = new Question("М'який знак на місці пропуску треба писати в усіх словах рядка", "піт..ма, хвац..куватий, зган..бити", "гордіст.., консул..ський, річен..ці", "корін..чик, виход..те, купал..ський", "русал..чин, погод..ся, лял..чин");
        Question twenty6 = new Question("М'який знак на місці пропуску НЕ ТРЕБА писати в усіх словах рядка", "Тет..яна, календар.., громадян..ський", "передач.., трудівниц.., Вернад..ський", "Ґдан..ськ, поділ..ський, карбован..цем", "барабан..щик, Ковал..ський, колис..ці");
        Question twenty7 = new Question("М'який знак на місці пропуску НЕ ТРЕБА писати в усіх словах рядка", "сип..те, тон..ший, корис..тю", "шануєш.., пан..щина, глянец..", "колос..ся, любов.., памороз..", "поліс..кий, мрієш.., пас..мо");
        Question twenty8 = new Question("М'який знак на місці пропуску НЕ ТРЕБА писати в усіх словах рядка", "сімдесят.., колодяз..ник, кобзар..", "безсил..ля, постав..те, борот..бист", "порад..те, склепін..частий, Сибір..", "ниточ..ці, повіл..но, славет..ність");
        Question twenty9 = new Question("М'який знак на місці пропуску НЕ ТРЕБА писати в усіх словах рядка", "Ул..яна, промін..чик, тварин..ці", "бояз..кий, ковз..кий, різ..бяр", "Луган..щина, угорс..кий, мас..ці", "млин..ці, галуз..ці, брин..чати");
        Question thirty = new Question("М'який знак на місці пропуску НЕ ТРЕБА писати в усіх словах рядка", "селян..ський, п'ят..сот, чотир..ма", "жмен..ці, стеблин..ці, ялинон..ці", "мен..ший, біл..ший, павутин..ці", "матін..чин, волин..ський, їдал..ня");
        Question thirty1 = new Question("Літеру И на місці пропуску треба писати в усіх словах рядка", "пал..чка, в..сочина, кош..чок", "д..плом, створ..ння, вогн..ще", "м..лькати, гл..бінь, скр..піти", "кр..шити, семююро, х..мерний");
        Question thirty2 = new Question("Літеру И на місці пропуску треба писати в усіх словах рядка", "промов..стий, сх..лития, тр..мати", "пр..звісько, вр..ватися, зб..регти", "виховат..ль, сел..ще, тр..валий", "к..рпатий, т..рплячий, розх..тати");
        Question thirty3 = new Question("Літеру И на місці пропуску треба писати в усіх словах рядка", "бл..скавці, одгр..міти, муз..ка", "печ..ніги, кр..тичний, заруч..ни", "хр..зантема, велос..пед, с..режки", "конт..нент, гор..зонт, п..рукар");
        Question thirty4 = new Question("Літеру E на місці пропуску треба писати в усіх словах рядка", "кл..котіти, заб..ру, ст..жина", "зам..сти, мороз..во, пош..пки", "шел..стіти, г..рой, глиб..на", "б..региня, скр..готати, л..мон");
        Question thirty5 = new Question("Літеру E на місці пропуску треба писати в усіх словах рядка", "ал..горія, скл..піння, ш..ренга, дон..чка", "вул..чка, оч..рет, ч..мпіон, юр..сдикція", "ф..стиваль, гр..чаний, плет..во, в..чоріти", "зам..рехтіти, гус..ниця, л..вада, т..раж");
        Question thirty6 = new Question("Літеру E на місці пропуску треба писати в усіх словах рядка", "д..шевий, лот..рея, ст..блина, щ..бетання", "щ..дрівка, вел..чезний, вист..лити, ч..пурний", "сут..нки, в..рещати, кол..скова, в..рболіз", "в..черя, кр..тичний, благоч..стивий, м..даль");
        Question thirty7 = new Question("Літеру O на місці пропуску треба писати в усіх словах рядка", "к..тушка, ак..рдеон, ..таман", "п..ром, марк..фаг, трансп..рант", "к..нфорка, пат..логія, к..шалот", "ф..нікулер, ді..рама, п..ролон");
        Question thirty8 = new Question("Літеру O на місці пропуску треба писати в усіх словах рядка", "б..рсук, кр..хмаль, м..настир", "пар..бук, г..нчар, оп..лонка", "к..зак, марм..ровий, з..зуля", "к..лосся, вор..шити, д..ріжка");
        Question thirty9 = new Question("Літеру O на місці пропуску треба писати в усіх словах рядка", "с..кира, кр..пива, п..ртрет", "ябл..ко, г..лубиний, л..пата", "т..вар, к..миш, марм..р", "к..жух, п..ріг, б..гатир");
        Question fourty = new Question("Правильно написано всі слова рядка", "калач, допомога, гонити", "отаман, горячий, ламати", "солдат, богато, паганий", "ганяти, багач, допомогати");
        Question fourty1 = new Question("Літеру З на місці пропуску треба писати в усіх словах рядка", "бе..силий, ро..копати, бе..крилий", "ро..повісти, ..цементувати, ..пекти ", "..ховати, ..керуваати, ро..чистити", "ро..кроїти, ..підлоба, бе..прав'я");
        Question fourty2 = new Question("Літеру З на місці пропуску треба писати в усіх словах рядка", "бе..барвний, ..молочений, ..жувати", "..тягнення, ..вернутися, ро..почати", "ро..писка, ..поживати, ро..клад", "..бивати, ро..писати, ..корочення");
        Question fourty3 = new Question("Префікс ЗІ є в кожному слові рядка", "..зв'янути, ..йтися, ..стрибнути", "..тнутися, ..грітися, ..кроїти", "..рвати, ..старитися, ..тримати", "..щулитися, ..псувати, ..клеїти");
        Question fourty4 = new Question("Літеру С на місці крапок треба писати в кожному слові рядка", "..касувати, не..проста, ..стискач", "..ховванка, ..чеплення, ..тиха", "..тратити, ..прожогу, ..жати", "..шиток, ..прямувати, ..терти");
        Question fourty5 = new Question("Літеру С на місці крапок треба писати в кожному слові рядка", "..фабрикувати, ..тяжка, ..пуск", "..чесати, ..кинути, ..цілення", "..тишити, ..терпіти, ..чинити", "..сунути, ..палахнути, ..хил");
        Question fourty6 = new Question("Літеру Е на місці крапок треба писати в кожному слові рядка", "пр..освященний, пр..мудрість, пр..чистий", "пр..бережний, пр..щедрий, пр..вражий", "пр..голубити, пр..завзятий, пр..кумедний", "пр..вільний, пр..святий, пр..земкуватий");
        Question fourty7 = new Question("Літеру Е на місці крапок треба писати в кожному слові рядка", "пр..великий, пр..непорочний, пр..стол", "пр..старий, пр..багато, пр..кінцевий", "пр..білений, пр..чудовий, пр..довгий", "пр..велебний, пр..дорожній, пр..тихий");
        Question fourty8 = new Question("Літеру И на місці крапок треба писати в кожному слові рядка", "пр..вабити, пр..голомшити, пр..бутки", " пр..жовкати, пр..міський, пр..мужній", "пр..марнілий, пр..купити, пр..мокрий", "пр..морожений, пр..сідати, пр..грубий");
        Question fourty9 = new Question("Літеру И на місці крапок треба писати в кожному слові рядка", "пр..мружити, пр..гірклий, пр..боркувати", "пр..ходити, пр..єднати, пр..зирливий", "пр..будова, пр..кордонний,пр..звище", "пр..подобний, пр..шитий, пр..співувати");
        Question fifty = new Question("Помилку в правописі префікса допущено в рядку", "обшукати, безслідно, зфальшивити", "надхмарний, оббити, розплющити", "міжсудинний, передплата, відчинити", "зіпсувати, безтурботний, обпекти");
        questions = new ArrayList<>();
        questions.add(one);
        questions.add(two);
        questions.add(three);
        questions.add(fore);
        questions.add(five);
        questions.add(six);
        questions.add(seven);
        questions.add(eight);
        questions.add(nine);
        questions.add(ten);
        questions.add(eleven);
        questions.add(twelve);
        questions.add(thirteen);
        questions.add(fourteen);
        questions.add(fifteen);
        questions.add(sixteen);
        questions.add(seventeen);
        questions.add(eighteen);
        questions.add(nineteen);
        questions.add(twenty);
        questions.add(twenty1);
        questions.add(twenty2);
        questions.add(twenty3);
        questions.add(twenty4);
        questions.add(twenty5);
        questions.add(twenty6);
        questions.add(twenty7);
        questions.add(twenty8);
        questions.add(twenty9);
        questions.add(thirty);
        questions.add(thirty1);
        questions.add(thirty2);
        questions.add(thirty3);
        questions.add(thirty4);
        questions.add(thirty5);
        questions.add(thirty6);
        questions.add(thirty7);
        questions.add(thirty8);
        questions.add(thirty9);
        questions.add(fourty);
        questions.add(fourty1);
        questions.add(fourty2);
        questions.add(fourty3);
        questions.add(fourty4);
        questions.add(fourty5);
        questions.add(fourty6);
        questions.add(fourty7);
        questions.add(fourty8);
        questions.add(fourty9);
        questions.add(fifty);
        count = 0;
        carentQuest=start;
        nextqust(start);
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        answer4.setOnClickListener(this);
    }

    public void nextqust(int start) {
        count=start;
        quest.setText((questions.get(count)).getQuestion());
        writeAnwer = ((questions.get(count)).getRightanswer());
        int check = (int) (Math.random() * 4);
        switch (check) {
            case 0:
                answer1.setText((questions.get(count)).getRightanswer());
                answer2.setText((questions.get(count)).getWronganserone());
                answer3.setText((questions.get(count)).getWrongansertwo());
                answer4.setText((questions.get(count)).getWronganserthree());
                break;

            case 1:

                answer1.setText((questions.get(count)).getWronganserone());
                answer2.setText((questions.get(count)).getRightanswer());
                answer3.setText((questions.get(count)).getWrongansertwo());
                answer4.setText((questions.get(count)).getWronganserthree());
                break;

            case 2:

                answer1.setText((questions.get(count)).getWronganserone());
                answer2.setText((questions.get(count)).getWrongansertwo());
                answer3.setText((questions.get(count)).getWronganserthree());
                answer4.setText((questions.get(count)).getRightanswer());
                break;

            case 3:
                answer1.setText((questions.get(count)).getWronganserone());
                answer2.setText((questions.get(count)).getWrongansertwo());
                answer3.setText((questions.get(count)).getRightanswer());
                answer4.setText((questions.get(count)).getWronganserthree());
                break;
        }

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        switch (id) {
            case R.id.textviewanswer1:
                if (answer1.getText().toString() == writeAnwer) {
                    result++;
                }
               if(carentQuest<start+qunt){nextqust(carentQuest++);}
               else goToFinish();
               break;
            case R.id.textviewanswer2:
                if (answer2.getText().toString() == writeAnwer) {
                    result++;
                }
                if(carentQuest<start+qunt){nextqust(carentQuest++);}
                else goToFinish();
                break;
            case R.id.textviewanswer3:
                if (answer3.getText().toString() == writeAnwer) {
                    result++;
                }
                if(carentQuest<start+qunt){nextqust(carentQuest++);}
                else goToFinish();
                break;
            case R.id.textviewanswer4:
                if (answer3.getText().toString() == writeAnwer) {
                    result++;
                }
                if(carentQuest<start+qunt){nextqust(carentQuest++);}
                else goToFinish();
                break;
            //Toast.makeText(this," "+id,Toast.LENGTH_SHORT).show();
        }
    }
    private void goToFinish(){
        Intent intent= new Intent(this,Result.class);
        intent.putExtra("Result",result);
        startActivity(intent);

    }
}



