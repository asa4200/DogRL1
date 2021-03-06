package com.example.dogrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DogEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_ex);

        Intent intent = getIntent();
        String Dogval = intent.getExtras().getString("견종번호");

        ImageView Dogimg = findViewById(R.id.Dogimg);

        TextView DogName = findViewById(R.id.DogName);
        TextView Dval1 = findViewById(R.id.Dval1);
        TextView Dval2 = findViewById(R.id.Dval2);
        TextView Dval3 = findViewById(R.id.Dval3);
        TextView Dval4 = findViewById(R.id.Dval4);
        TextView Dval5 = findViewById(R.id.Dval5);
        TextView Dval6 = findViewById(R.id.Dval6);
        TextView Dval7 = findViewById(R.id.Dval7);
        TextView Dval8 = findViewById(R.id.Dval8);
        TextView Dval9 = findViewById(R.id.Dval9);
        TextView Dval10 = findViewById(R.id.Dval10);
        TextView Dval11 = findViewById(R.id.Dval11);
        TextView Dval12 = findViewById(R.id.Dval12);
        TextView Dval13 = findViewById(R.id.Dval13);

        switch (Dogval){
            case "1" :
                Dogimg.setImageResource(R.drawable.d001);
                DogName.setText("사모에드");
                Dval1.setText("수컷 54~60cm・암컷 50~56cm");
                Dval2.setText("16~30kg");
                Dval3.setText("러시아 북부 및 시베리아");
                Dval4.setText("사람을 잘 따르고 외로움을 많이 탐");
                Dval5.setText("관절질환");
                Dval6.setText("추위에 매우 강한 견종이다. 눈 속에서 자도 멀쩡하다");
                Dval7.setText("30분 x 2");
                Dval8.setText("핀 브러시, 슬리커 브러시, 일자빗");
                Dval9.setText("시베리아 혹한의 환경을 견뎌냈을 만큼 두터운 순백의 털은 세심한 빗질과 정기적인 샴푸로 유지합니다\n");
                Dval10.setText("성격은 매우 쾌활하고 어리광이 심하며, 장난을 좋아하고 강아지처럼 즐거워 보이는 견종입니다. 항상 주인 곁에 있고 싶어 할 만큼 외로움을 심하게 타기 때문에 매일 집을 비우는 가정에는 맞지 않습니다.");
                Dval11.setText("추위에는 강하지만 더위에는 약하므로 옥외견의 경우 개집의 위치와 통풍에 신경을 써야합니다. 또한, 한여름의 산책은 서늘한 시간대에 합니다. ");
                Dval12.setText("머리는 쐐기 모양이고, 눈은 어두운 색으로 깊이 우묵하며, 표정이 지적입니다. 귀는 곧게 서고 끝이 둥글며, 몸통은 중간 정도의 길이로 늑골이 잘 발달되어 있습니다. 털은 2가지로서, 하모(下毛)는 조밀하고 두꺼우며 양털과 같이 부드러우나 표면의 털은 길고 다소 뻣뻣한데, 목둘레와 앞가슴의 털이 특히 우아합니다. 털빛깔은 흰색 외에 크림색, 옅은 갈색도 있습니다");
                Dval13.setText("관절질환에 걸리기 쉬우니 매일 아침저녁으로 30분 정도의 당김운동을 통해 다리와 허리를 단련시키면서 건강을 유지하는 것이 좋습니다. 또한 당뇨에도 걸리기 쉽기 때문에 항상 주의해야 합니다.");
                break;
            case "2" :
                Dogimg.setImageResource(R.drawable.d002);
                DogName.setText("말티즈");
                Dval1.setText("25cm ");
                Dval2.setText("3.2kg 이하");
                Dval3.setText("중앙지중해연안 지역");
                Dval4.setText("항상 안겨 있고 싶어 하는 어리광쟁이");
                Dval5.setText("슬개골 탈구, 유루증, 부정교합, 치질환 등");
                Dval6.setText("추위에 약한 견종이므로 겨울에는 특히 난방에 신경 써야 한다.");
                Dval7.setText("10분 x 2");
                Dval8.setText("핀 브러시, 슬리커 브러시, 일자빗");
                Dval9.setText("말티즈는 타고난 애완견으로 작업견이나 사냥개로 이용되던 역사가 없었습니다. 순백에 실크 같은 광택이 있는 피모를 가졌으며 밑털이 없습니다. 새까맣고 동그란 눈도 특징입니다.");
                Dval10.setText("지적이고 우아, 활발하고 밝고 쾌활한 애완견으로 작은 몸에 어울리지 않게 용감합니다. 사람의 마음을 민감하게 감지하고 어리광이 능숙한 면도 있습니다. 또한 매우 다정다감한 성격으로 사람을 몹시 좋아하고 영리해서 화장실 훈련이 잘 되고 크게 손이 가지 않습니다.");
                Dval11.setText("순백색의 비단결 같은 겉털아래 이른바 언더코트(undercoat)로 불리는 속털이 없는 것이 특징입니다. 긴 털은 등에서 좌우로 갈라져서 땅에 닿을 정도로 늘어져 있는데, 뒤틀림이 전혀 없습니다. 머리 윗부분이 둥글게 굽어 있고, 양쪽 귀의 간격이 넓다. 눈은 검고 털 안쪽에 외따로 붙어 있습니다. 귀와 꼬리, 네 다리에도 장식털이 풍부하며, 등이 곧고 가슴이 잘 발달하였습니다 ");
                Dval12.setText("말티즈는 얼굴 주변의 털이 길어서 그 털이 자라서 눈을 자극하여 결막염을 일으키기도 하므로 주의해야 합니다.");
                Dval13.setText("말티즈는 모든 사람들에게 친절하고 집도 잘 지키지만 아이들을 자신의 라이벌로 생각하고 대드는 경향이 있기 때문에 서열 정하기 훈련에 신경을 써야 합니다.");
                break;
            case "3" :
                Dogimg.setImageResource(R.drawable.d003);
                DogName.setText("푸들");
                Dval1.setText("45~60cm");
                Dval2.setText("수컷 25kg 전후・암컷 23kg 전후");
                Dval3.setText("프랑스");
                Dval4.setText("온순, 쾌활하고 사람을 매우 좋아한다");
                Dval5.setText("피부질환, 유루증, 정유고환");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다.");
                Dval7.setText("60분 x 2");
                Dval8.setText("슬리커 브러시, 일자빗");
                Dval9.setText("깜찍하고 사교적인 성격을 갖고 있어 애교를 잘 부립니다. 또한 충성심이 깊고 학습 능력이 뛰어나며 훈련하기 쉬워서 반려견으로 매우 적합합니다\n");
                Dval10.setText("푸들의 성격은 대체로 총명하고 명랑한 성격을 지니고 있으며, 애교와 재롱이 많고 사람을 잘 따릅니다. 온화하고 사교적인 성격이라 주인에 대한 충성심이 강하며 이러한 성격탓에 푸들은 혼자 있는 것을 싫어해 분리불안증에 걸리기 쉽습니다. 때문에 혼자 두면 하울링을 하거나 말썽을 부리는 모습을 자주 보이는데 이는 혼자 있기 싫어하는 성격 때문입니다. 영리한 개이기 때문에 사고뭉치가 되는 일이 거의 없습니다. 팔에 안고 다니는 애완견의 이미지와 달리 선천적으로 활달한 성격입니다.\n");
                Dval11.setText("비율이 적당히 잘 맞는 체형으로, 푸들의 특징인 곱슬곱슬한 털이 돌돌 말리거나 매듭처럼 꼬인 형태로 덮여 있습니다. \n");
                Dval12.setText("푸들은 건강한 견종에 속하지만 쉽게 살이 찌는 경향이 있습니다. 머리가 좋아 한번 호사스러운 맛을 보면 그 음식만 찾기 때문에 살이 찌지 않도록 사람들이 먹는 음식은 주지 말고, 대신 영양가가 골고루 들어간 음식을 주도록 합니다.\n");
                Dval13.setText("실내에서 놀다가 넘어져 무릎 등의 관절을 다치는 경우가 있으므로 주의해야 합니다");
                break;
            case "4" :
                Dogimg.setImageResource(R.drawable.d004);
                DogName.setText("치와와");
                Dval1.setText("15~23cm");
                Dval2.setText("2.7kg 이하");
                Dval3.setText("멕시코");
                Dval4.setText("마이페이스에 제멋대로");
                Dval5.setText("슬개골 탈구, 구개열, 기관허탈, 천문개존(두개골의 윗부분이 열려 있는 증상),  안질환");
                Dval6.setText("추위에 약한 견종이므로 겨울에는 특히 난방에 신경 써야 한다.");
                Dval7.setText("10분 x 1");
                Dval8.setText("핀 브러시, 슬리커 브러시, 일자빗");
                Dval9.setText("세계에서 가장 견종으로 소리도 작고 운동량이 별로 필요하지 않기 때문에 집 안에서 키울 애완견을 원하는 사람들에게 잘 맞는 반려견입니다. \n");
                Dval10.setText("몸이 작으니 성격도 약할 것으로 생각하기 쉬우나 실제로는 승부욕이 강하고 툭하면 싸우려는 기질이 있습니다. 평소에는 어리광쟁이에 천진난만하지만 겁쟁이 같은 모습도 공존합니다. 상당히 섬세한 성격으로 귀엽다고 어리광쟁이로 키우다가는 자기중심적인 성격이 될 수 있습니다. ");
                Dval11.setText("멕시코 치와와 원산으로 가장 작은 품종입니다. 키는 18cm 정도이며 몸무게는 3kg 이하이며 개체에 따라 몸무게가 500g밖에 안되는 것도 있습니다. 털이 매끈매끈한 단모종 외에 장모종도 있는데, 단모가 보통입니다. 귀는 크고 쫑긋하며, 눈은 크고 약간 볼록하게 보이며. 털빛깔은 붉은색 ·검은색 ·담황색 ·얼룩무늬 등 여러 가지가 있습니다");
                Dval12.setText("추위에 약하기 때문에 추워지면 애견용 히터나 전기방석에 수건을 씌워 따뜻하게 해줍니다. 연간 실온은 23~25℃가 가장 적당합니다. 몸의 변화는 대변을 통해 즉각 나타나므로 매일 점검하는 것이 좋습니다. 또한 눈이 크고 앞으로 툭 튀어나와 있기 때문에 눈 건강에도 주의가 필요합니다. 앞발로 눈을 비비거나 눈곱과 눈 색깔에 변화가 생겼을 때는 곧바로 진찰을 받도록 합니다. 강아지 때는 머리나 관절, 그리고 등뼈에 부담이 가지 않도록 신경 써주어야 하며 머리가 충격에 약하므로 달리다 부딪치거나 계단 또는 의자에서 떨어지지 않도록 각별히 주의해야 합니다.");
                Dval13.setText("'앉아', '엎드려' 등의 간단한 훈련은 가능하지만 고도의 훈련을 시키면 오히려 화를 내는 경향이 있기 때문에 훈련에 실패했다고 벌을 주거나 야단 치는 것보다 시간이 걸리더라도 끈기 있게 반복하는 것이 중요합니다.");
                break;
            case "5" :
                Dogimg.setImageResource(R.drawable.d005);
                DogName.setText("시츄");
                Dval1.setText("26.7cm 이하 ");
                Dval2.setText("4.5~8.1kg");
                Dval3.setText("중국(티벳)");
                Dval4.setText("나이브하면서도 감정이나 표정은 오버하는 경향이 있다");
                Dval5.setText("유루증, 구개열, 안질환");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다.");
                Dval7.setText("10분 x 2");
                Dval8.setText("핀 브러시, 슬리커 브러시, 일자빗");
                Dval9.setText("멋지게 늘어진 털이 사자 갈기처럼 보여 중국어로 ‘사자견’이라는 뜻을 갖고 있는 시추는 청나라 말기 서태후가 아끼던 궁중의 개로 유명합니다. 애교 있고 귀여운 표정이 있는 둥근 얼굴을 갖고 있고 납작한 코가 귀여움을 돋보이게 합니다. 외모만큼이나 영리하고 밝고 다정한 성격으로 모든 사람을 잘 따라 많은 이들에게 사랑받는 품종입니다. 대체로 원만한 성격을 갖고 있고 조용한 편으로 혼자서도 잘 놉니다.");
                Dval10.setText("작업견도 사냥견도 아니기 때문에 온후하고 사람을 매우 따릅니다. 경계심도 헛울음도 거의 없기 때문에 가정에서 키우기 쉬운 것도 장점입니다. 애정표현이 풍부하고 사람을 잘 따르는 편이어서 누구와도 사이좋게 지내는 것이 최대의 매력입니다. 그러나, 시추는 주인의 행동에 다양하게 반응하고 몸 전체로 감정을 표현하는 반면 사실 고집스러운 면도 있고, 커뮤니케이션 부족으로 스트레스가 쌓이면 신경질적인 성격이 되기도 합니다. 그 결과 낯선 사람에게 하염없이 짖어대거나 다소 공격적인 모습을 보이기도 합니다.");
                Dval11.setText("멋지게 늘어진 2중모와 등 위로 곡선을 그리는 꼬리가 특징인 장모종으로 털을 매일 손질해 주어야 하지만 털길이에 비해 털은 많이 빠지지 않으며 체취도 많이 나지 않으므로 가정견으로 이상적입니다.");
                Dval12.setText("매력포인트인 큰 눈은 결막염에 걸리기 쉽기 때문에 충혈된 것 같으면 서둘러 동물병원에 데리고 갑니다. 털이 많을 뿐만 아니라 털이 코를 중심으로 국화꽃처럼 자라기 때문에 눈에 트러블이 많은 편이기때문에 자주 눈물이 나고 눈곱이 생겨 눈이 충혈되고 염증이 생깁니다. 눈 주위에 털은 가능하면 짧게 잘라주고, 털을 길게 해주고 싶으면 눈 주위의 털을 조금씩 묶어두면 좋습니다.  또 음식물 찌꺼기가 붙으면 잡균이 번식하기 쉬우므로 음식물을 준 뒤에는 반드시 입 주위를 점검합니다.");
                Dval13.setText("시추를 키울 때는 주인이 간단한 트리밍 기술을 습득하는 것이 좋습니다. 하지만 반려견을 다치게 하지 않으려면 가위 사용에 주의가 필요하므로 자신이 없다면 프로 트리머에게 정기적으로 맡기도록 합니다. 얼굴의 털을 길러 리본으로 묶어주면 더 사랑스러운 모습을 연출할 수 있습니다.");
                break;
            case "6" :
                Dogimg.setImageResource(R.drawable.d006);
                DogName.setText("닥스훈트");
                Dval1.setText("수컷 23~27cm・암컷 21~24cm");
                Dval2.setText("9~12kg");
                Dval3.setText("독일");
                Dval4.setText("모질에 따라 다르다");
                Dval5.setText("안질환, 추간판 질환\n");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다.");
                Dval7.setText("30분 x 2");
                Dval8.setText("모질에 따라 다르다");
                Dval9.setText("닥스훈트는 모질에 따라 스무스, 롱, 와이어 세 가지 타입이 있는데, 성격도 제각각입니다. 스무스는 사람을 잘 따르고 명랑 활발하고, 롱은 얌전하고 응석부리기를 좋아하며, 와이어는 개구쟁이에 호기심이 왕성하고 장난치기를 좋아합니다. 어느 타입이든 각각 장점과 매력이 많고 한국의 주택환경에 맞는 사이즈입니다.");
                Dval10.setText("성격이 장난스럽고 밝아 주위를 재미있게 만드는 매력을 갖고 있습니다. 또한 수렵견으로 활약했기 때문에 판단력이 있고 자신에게 주어진 상황을 잘 파악합니다.\n");
                Dval11.setText("체고가 낮고 다리가 짧습니다. 몸이 길지만 전체적으로 작고 다부진 체형으로, 근육이 잘 발달되어 있습니다. 머리를 다소 거만하고 도전적인 모습으로 들고 있으며, 얼굴에서는 기민한 표정이 느껴집니다. 이 같은 특징은 대체로 수컷에서 두드러지게 나타납니다. 긴 몸에 비해 다리가 짧지만 매우 활동적이고 유연합니다.\n");
                Dval12.setText("허리가 길어서 디스크에 걸릴 가능성이 있으므로 껑충껑충 뛰는 행동을 못하도록 합니다. 특히 동장단족의 체형이 다리관절 형성부전이나 추간판헤르니아 같은 특이질환의 원인이 되기도 합니다. 또한 살이 찌기 쉬운 체질인 미니어처 닥스훈트에게 무턱대고 밥을 주거나 간식을 과다 급여하면 쉽게 비만이 되고, 동체가 긴 특성상 무거운 체중을 지탱하다 보니 추간판헤르니아가 발병하게 됩니다. 이 질환은 반려인의 사육방법에도 원인이 있는 만큼 식사관리를 철저히 하도록 하는 것이 중요합니다.");
                Dval13.setText("허리를 상하게 하는 무리한 점프는 하지 않도록 하고, 운동은 발목이나 등에 부담을 주지 않고 전신운동을 할 수 있는 수영을 강아지 때부터 할 수 있게 해주는 것이 좋습니다.");
                break;
            case "7" :
                Dogimg.setImageResource(R.drawable.d007);
                DogName.setText("요크셔테리어");
                Dval1.setText("23cm 전후 ");
                Dval2.setText("3.1kg 이내");
                Dval3.setText("영국");
                Dval4.setText("주인과 있으면 드세고 쾌활해진다");
                Dval5.setText("슬개골 탈구, 저혈당증");
                Dval6.setText("추위에 약한 견종이므로 겨울에는 특히 난방에 신경 써야 한다.");
                Dval7.setText("10분 x 2");
                Dval8.setText("핀 브러시, 슬리커 브러시, 일자빗");
                Dval9.setText("실크처럼 매끄러운 긴 털이 매력적인 요크셔테리어는 ‘요키’라는 애칭으로도 불리며, 항상 인기순위의 상위를 유지해왔습니다. 기네스북에는 가장 작은 개로 공인된 개체의 기록도 있습니다. ");
                Dval10.setText("경계심과 승부욕이 강하고 시끄럽게 잘 짖습니다. 주인과 함께 있을 때는 쾌활하고 종종걸음으로 잘 돌아다니지만, 응석받이에 외로움도 잘 타서 장시간 혼자 두거나 펫호텔에 맡기면 갑자기 건강이 나빠질 수도 있습니다. 또한 주인에 대한 소유욕이 크고 질투심도 강한 편이기 때문에 집안에 어린아이가 있을 경우 질투심을 더 심하게 느끼기도 합니다. ");
                Dval11.setText("털이 길고 몸체는 깔끔하고 암팡지며 비례를 이루고 있습니다. 비단실 같은 긴 털이 온몸을 뒤덮고 있어 마치 부인이 옷을 땅에 끌리도록 입고 다니는 것과 같이 보이기도 합니다. 머리는 약간 작고 등은 곧으며 사지는 짧고 앞발은 곧고 발가락은 동그랗습니다.");
                Dval12.setText("슬개골 탈구 같은 관절질환이 많으므로 어릴 때 영양공급을 충분히 해주도록 합니다.");
                Dval13.setText("잘못 키워 어리광을 부리게 하거나 제멋대로인 성격을 방치하면 반려인에게도 짖어대는 신경질적인 개가 될 수 있습니다. 강아지 때부터 엄격한 훈육이 중요하며 반려인은 주도권을 잃어서는 안됩니다. 또한, 예민하여 스트레스가 쌓이기 쉬우므로 짧은 시간이라도 매일 산책 시키는 것이 좋습니다.");
            case "8" :
                Dogimg.setImageResource(R.drawable.d008);
                DogName.setText("비글");
                Dval1.setText("33~40cm");
                Dval2.setText("8~14kg");
                Dval3.setText("영국 ");
                Dval4.setText("식탐이 많고 말썽꾸러기지만 온순");
                Dval5.setText("간질, 추간판 질환 등");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다");
                Dval7.setText("30분 x 2");
                Dval8.setText("솔 브러시");
                Dval9.setText("미국에서는 마약을 찾아내는 데 이용하였다고 할  정도로 후각이 예민합니다. 또한 사냥개 중에서 제일 작으며, 근육이 매우 단단하고, 늘어진 긴 귀를 갖고 있어 폭스 하운드· 해리어와 비슷해 보입니다. 우리에게는 애니메이션 캐릭터인 스누피의 모델이 된 개로 유명합니다.\n");
                Dval10.setText("신경을 자극하는 냄새가 나면 쫒아다니고 싶어 안달을 할 정도로 호기심이 왕성합니다. 명랑하고 유머러스한 성격때문에 수렵견으로서뿐만 아니라 오늘날에는 가정용 애완견으로 사랑받고 있습니다.");
                Dval11.setText("길이가 짧고 매끄러운 털은 세고 곧으며 숱이 많습니다. 머리 부분은 적당히 길고 넓으며, 스톱(stop:짐승의 앞이마와 입코 부분 사이의 오목한 곳)은 명확합니다. 눈은 어두운 갈색이며, 귀는 적당하게 낮고 길게 늘어져 상당히 넓습니다.");
                Dval12.setText("기본적으로 건강한 견종이지만. 식욕이 왕성하여 주는 대로 먹어버리기 때문에 비만에 각별히 신경써야 합니다. 또 몸을 움직이기를 좋아하므로 노는 시간을 충분히 줍니다. 단 하체에 부담을 주지 않는 땅이나 잔디 위에서 놀게 합니다.");
                Dval13.setText("가족은 물론 낯선 사람에게도 꼬리를 흔들며 다가갈 만큼 사람을 매우 좋아하고, 칭찬 받거나 야단 맞았을 때 반응의 차이가 확연하게 드러나는 견종입니다. 자칫 그 표정에 넘어가 응석을 받아주며 지나치게 오냐오냐 하는 것은 좋지 않습니다. 외로움을 많이 타는 성격인 만큼 커뮤니케이션이 부족해지면 저음울음으로 이웃에게 피해를 줄 수 있으니 조심해야 합니다.");
                break;
            case "9" :
                Dogimg.setImageResource(R.drawable.d009);
                DogName.setText("보더콜리");
                Dval1.setText("수컷 53cm・암컷 53cm 미만");
                Dval2.setText("14~20kg");
                Dval3.setText("영국(스코틀랜드)");
                Dval4.setText("지능이 높고 천진난만하고 사람을 잘 따른다");
                Dval5.setText("관절질환, 피부질환");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다");
                Dval7.setText("60분 x 2");
                Dval8.setText("핀 브러시, 일자빗");
                Dval9.setText("보더콜리는 바이킹족에 의해 스코틀랜드 지방으로 들어와 8~11세기 순록을 지켰던 목양견입니다. 특히 목양견 중에서도 최고로 꼽히는 양치기개로서, 영화 〈꼬마돼지 베이브〉에 나오는 바로 그 양치기개가 이 보더콜리입니다. 보더콜리는 개 지능테스트에서 가장 영리한 개로 뽑혔을 정도로 총명하고 학습 능력이 뛰어나며 주인에게 충성해 깊은 애정을 보입니다.");
                Dval10.setText("주인에게는 복종하고 총명, 지적호기심이 강합니다. 다른 사람이나 개에게는 먼저 커뮤니케이션을 취하지 않지만 공격적이지도 않습니다.\n");
                Dval11.setText("키는 53cm, 몸무게는 수컷 18∼23kg, 암컷 14∼20kg으로 대체적으로 암컷이 수컷보다 약간 작습니다. 골격이 튼튼하며 몸매가 잘 균형 잡혀 있습니다. 머리는 넓고 이마는 편평하며 양볼은 안쪽으로 패어 있습니다. 귀는 반만 쫑긋 세워져 있습니다. 꼬리는 보통 길이이고 낮게 늘어져 있습니다. 겉털은 갈기처럼 길고 풍성하며, 속털은 짧고 부드럽습니다. 얼굴, 귀 끝, 앞다리, 뒷다리의 발끝에서 무릎까지는 매끄러운 털이 짧게 나 있습니다. 털빛깔은 검은색, 회색, 흰색과 갈색이 섞인 것, 검은색·푸른색·회색이 섞인 대리석색 등이 있습니다.");
                Dval12.setText("일반적으로는 건강하지만 관절에 문제가 있거나 망막 쇠약 같은 눈병이 있을 수 있습니다. 두꺼운 속털 속에 있는 진드기는 찾아내기 어려우므로, 자주 점검해 줍니다.");
                Dval13.setText("숱이 많고 속털이 깊은 편으로 엉키지 않도록 빗질을 자주 해주고 털갈이 시기에는 특히 신경을 써야 합니다. 운동신경이 좋다고 해서 무턱대고 운동을 시키면 관절질환과 피부질환에 걸릴 수 있으므로 과격한 운동은 피하는 것이 좋습니다. 산책은 매일 아침저녁으로 하루 2회, 자전거 등을 이용해 구보를 포함한 운동을 충분히 시켜주는 것이 좋습니다.");
                break;
            case "10" :
                Dogimg.setImageResource(R.drawable.d010);
                DogName.setText("골드리트리버");
                Dval1.setText("수컷 56~61cm・암컷 51~56cm");
                Dval2.setText("수컷 29~34kg・암컷 25~30kg ");
                Dval3.setText("영국(스코틀랜드)");
                Dval4.setText("온순한 평화주의자로 아이들도 매우 좋아한다");
                Dval5.setText("고관절형성부전, 피부질환, 안검내반증, 백내장");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다.\n");
                Dval7.setText("60분 x 2");
                Dval8.setText("핀 브러시, 일자빗");
                Dval9.setText("원래 총에 맞아 떨어진 사냥감을 물속에서 회수(리트리브)하기 위해 일하던 개이기 때문에 근육이 잘 발달되어 있고 단단한 것이 특징입니다.");
                Dval10.setText("골든 리트리버는 충성심이 강해서 반려견으로 최적입니다. 사람을 좋아하고 호기심이 강하므로 훈련 중에 산만해지는 경향도 있지만, 학습능력이 높기 때문에 잘 훈련시키면 기르기 편한 견종입니다.");
                Dval11.setText("짙은 황금색의 털을 가진 아름다운 개로, 찬 물 속에서도 견딜 수 있도록 긴 털이 많이 나 있고 앞발 뒤쪽에는 장식털이 나 있습니다. 가슴이나 뒷발의 허벅지 뒤쪽, 꼬리의 아래쪽 면에도 털이 있습니다. 머리는 납작하고 넓으며,  주둥이도 넓고 깊어 이지적이며 부드러운 느낌을 줍니다.");
                Dval12.setText("골든 리트리버는 이상적인 반려견이지만 높은 인기 때문에 무분별하게 번식시킨 결과 유전성 고관절형성부전이 많이 발견됩니다. 안타깝게도 새끼 때는 파악하기 어렵고 성장하면서 발병하는 케이스가 대부분이므로 정기적인 건강진단과 적절한 운동을 해 주는 것이 좋습니다. 또한 운동을 하지 못하면 스트레스가 쌓여 문제 행동을 일으키기 쉬우므로 충분히 운동시켜 줘야 합니다.");
                Dval13.setText("생후 2세까지는 응석이 심하고 항상 가족과 있고 싶어 합니다. 때문에 과도하게 짖기도 하고 심한 장난으로 실내를 엉망으로 만드는 경우도 종종 있습니다. 하지만 생후 2세를 넘기면 우수한 반려견이 될 것이고 가족이 함께 극복한다면 3세부터는 반려인이 오히려 적적함을 느낄정도로 침착하게 변모합니다.");
                break;
            case "11" :
                Dogimg.setImageResource(R.drawable.d011);
                DogName.setText("진돗개");
                Dval1.setText("수컷 50~55cm・암컷 45~50cm");
                Dval2.setText("수컷 18~23kg・암컷 15~19kg");
                Dval3.setText("한국");
                Dval4.setText("충실하고 경계심이 강하다.");
                Dval5.setText("알레르기질환");
                Dval6.setText("추위에 매우 강한 견종이다. 눈 속에서 자도 멀쩡하다.");
                Dval7.setText("30분 x 2");
                Dval8.setText("솔 브러시, 일자빗");
                Dval9.setText("진돗개는 대담하고 용맹스럽기로 이름이 높은데, 산 속에서 멧돼지 같은 맹수를 만나도 겁을 먹지 않고 덤벼든다고 합니다. 야생동물을 물었을 때 한 번 물면 놓지 않는 지독한 근성을 가지고 있으며 개들끼리 싸울때도 자신의 몸집보다 훨씬 큰 대형 견종과 맞붙어 한치도 물러서지 않습니다.  진돗개 고유의 능력 가운데 가장 두드러진 것은 수렵성으로 외국 사냥개와 달리 특별한 훈련을 거치지 않고도 수렵견으로서 뛰어난 자질을 발휘합니다.");
                Dval10.setText("진돗개는 주인에 대한 충성심과 복종심이 강하며 뛰어난 귀가성을 간직하고 있습니다. 때문에 진돗개는 첫 정을 준 주인을 오랫동안 잊지 못해 강아지 때부터 기르지 않고 성견을 분양받았을 경우 탈주 사태가 종종 일어나기도 합니다. 경계심이 강하고 이상을 감지하는 능력이 뛰어나 수상한 사람이 접근하면 짖거나, 상황에 따라서는 가차 없이 공격적인 모습을 보이기도 합니다.");
                Dval11.setText("얼굴은 정면에서 보면 거의 팔각형을 이루고 있습니다. 눈은 붉고 둥근듯하며 눈꼬리는 약간 치켜올라가 귀밑 선상에 맞아야 합니다. 귀는 앞으로 약간 경사져 곧게 서 있습니다. 목은 굵어서 힘이 있고 다부지게 보입니다. 등은 좌골뼈에서 부터 약간의 곡선으로 이루어져 있으며 등털은 중장모로써 힘이 있어 낚싯바늘이나 가시와 같습니다. 다리는 강건하고 앞다리와 뒷다리는 모두 자연스럽게 똑바로 곧게 서 있습니다. 꼬리는 항문에서부터 수직으로 위쪽으로 7㎝~8㎝ 이상 올라갔다가 좌나우로 똑바로 말리거나 서거나 합니다. 꼬리의 길이는 비절에 다을 정도가 알맞고, 꼬리털은 바깥쪽으로 쭉 뻗은 부채형이 바람직합니다.\n");
                Dval12.setText("믿음직스러운 번견이며 동아시아에서는 건강관리에 크게 손이 가지 않으므로 꽤 키우기 쉬운 견종이라고 할 수 있습니다.");
                Dval13.setText("낯선 사람을 경계하여 만지는 것을 좋아하지 않고 다른 견종들을 경계하며 특히 수컷을 좋아하지 않습니다.");
                break;
            case "12" :
                Dogimg.setImageResource(R.drawable.d012);
                DogName.setText("시베리안허스키");
                Dval1.setText("수컷 53.5~60cm・암컷 50.5~56cm");
                Dval2.setText("수컷 20.5~28kg・암컷 15.5~23kg");
                Dval3.setText("미국");
                Dval4.setText("쾌활하며 낙천적이고 주인에게 충성스럽다.");
                Dval5.setText("슬개골 탈구, 지루증, 갑상선기능 장애, 외이염, 백내장");
                Dval6.setText("추위에 매우 강한 견종이다. 눈 속에서 자도 멀쩡하다.");
                Dval7.setText("60분 x 2");
                Dval8.setText("핀 브러시, 일자빗");
                Dval9.setText("혹독한 추위에 견딜 수 있도록 인내심이 강하고, 성질은 온순해서 사람을 잘 따릅니다. 독립적이고 힘이 세고 빠르지만 공격심이 부족하기 때문에 경비견으로는 곤란합니다. 수명은 11~13년 정도 입니다.");
                Dval10.setText("늑대처럼 보이는 외모 때문에 가까이 하기 어려운 인상이지만 성격은 지극히 명랑하고 낙천적입니다. 마음을 허락한 사람에게는 매우 순종적이지만, 낙천적인 성격 때문인지 훈련할 때는 애를 먹곤 합니다. ‘미아가 되면 집에 찾아오지 못할 만큼 머리가 나쁘다’는 말도 있을 정도인데, 사실은  고생해서 집에 돌아오지 않아도 살기 편한 곳을 발견하면 ‘여기도 꽤 괜찮은데?’라는 생각으로 정착할 정도로 낙천적이기 때문이라고 합니다.");
                Dval11.setText("머리는 윗머리가 반구형이며 주둥이 끝이 가늘고, 눈꼬리는 약간 올라간 아먼드형입니다. 눈동자는 갈색 또는 청색이 많으며 귀는 삼각형 모양의 중간 정도 크기로, 머리 윗부분에 높게 위치하며, 경계할 때는 평행이 됩니다. 목 근육이 발달해 서 있을 때 당당한 모습을 보여 주며, 등은 곧고 적당합니다. 촘촘히 나 있는 속털을 부드러운 겉털이 감싸고 있으며, 꼬리도 털로 두껍게 덮여 있습니다.");
                Dval12.setText("추운 지방에서 살던 품종이어서 숱이 많은 털을 갖고 있어 굉장히 많이 빠집니다. 빗질을 자주 해주어야 하며 특히 여름에는 피부에 통풍이 잘 되도록 신경을 많이 써야 합니다.");
                Dval13.setText("활동적인 성격탓에 집안을 어지르고 다니며 말썽을 부릴 수 있기 때문에 어린 강아지 시절부터 엄격하게 훈련시키는 것이 좋습니다. 썰매견은 우두머리를 따르는 경향이 있으므로 어릴 때 주인을 우두머리로 인식하게 하여야 성견이 된 후에도 통제하는데에 어렵지 않습니다. 만약에 주인이 통제하지 못할 경우엔 다루기 어렵고 때론 위험할 수 있으니 개를 처음 기르는 경우에는 선택하지 않는 것이 좋습니다. 활발하고 활동량이 많은 시베리아 허스키는 운동량이 부족하면 스트레스를 많이 받기 때문에 규칙적으로 운동을 시켜주시는 것이 좋습니다.");
                break;
            case "13" :
                Dogimg.setImageResource(R.drawable.d013);
                DogName.setText("슈나우저");
                Dval1.setText("30~35cm");
                Dval2.setText("4.5~7kg");
                Dval3.setText("독일");
                Dval4.setText("천진난만하고 호기심 가득");
                Dval5.setText("요로계 질환, 백내장, 정유고환 등");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다.");
                Dval7.setText("10분 x 2");
                Dval8.setText("핀 브러시, 일자빗");
                Dval9.setText("트리밍에 따라 인상이 달라지는데, 슈나우저라는 이름이 독일어로 ‘콧수염’이라는 뜻인 만큼 기본 형태로 트리밍하면 마치 고집스러운 철학자처럼 보입니다. ");
                Dval10.setText("명랑하고 활달하지만 대부분의 슈나우저들은 태어날때부터 두려움을 거의 모른다고 할 수 있습니다. 그러나 명령에 잘 순종하며 우호적이고 영리하여 경비견으로서 우수한 자질을 갖고 있습니다.");
                Dval11.setText("전체적으로 키와 몸무게가 비슷해서 거의 사각형에 가깝습니다. 머리는 긴 사각형으로 단단하고 나비가 좁으며 이마에는 주름이 없습니다. 꼭대기는 편평하고 꽤 긴 편입니다. 눈은 어두운 갈색으로 타원형이며 작고 움푹하게 패어 있습니다. 귀는 작고 V자 모양이며 머리쪽으로 접혀 있습니다. 대개 귀를 잘라주는데, 머리 위쪽에 높게 위치하며 끝이 뾰족합니다.");
                Dval12.setText("튼튼하고 건강하므로 특별히 걱정할 일은 없습니다. 유전적인 질병으로 신장병, 방광염, 요석증 등의 비뇨기계의 질병이 있습니다.");
                Dval13.setText("첫 만남에서 실패하면 한동안 얼굴을 기억했다가 볼 때마다 짖기도 하지만, 가족에게는 믿을 수 없을 정도로 응석을 부리고 고분고분합니다. 무엇보다 새끼 때부터 충분히 애정을 쏟으며 커뮤니케이션을 해 주는 것이 중요합니다.");
                break;
            case "14" :
                Dogimg.setImageResource(R.drawable.d014);
                DogName.setText("도베르만");
                Dval1.setText("수컷 68~72cm・암컷 63~68cm");
                Dval2.setText("수컷 약 40~45kg・암컷 약 32~35kg");
                Dval3.setText("독일");
                Dval4.setText("온순하고 호기심 왕성하고 영리하다.");
                Dval5.setText("피부질환, 관절질환");
                Dval6.setText("추위에 특별히 약하지 않은 평균적인 견종이다");
                Dval7.setText("60분 x 2");
                Dval8.setText("솔 브러시");
                Dval9.setText("일반적으로 귀를 세우기 위해서 단이하고, 꼬리도 짧게 단미하지만  최근 유럽에서는 단이와 단미가 금지되어 도그쇼에서 볼 수 있는 도베르만은 대부분 늘어진 귀와 긴 꼬리입니다.");
                Dval10.setText("영화나 드라마 등에서 나온 도베르만은  흉포한 이미지가 강지만 원래 성격은 온순하고 호기심이 왕성하며 주인에게는 상당한 응석받이입니다. 또한 영리해서 훈련의 이해가 빠르기 때문에  좋은 반려견이 될 수 있을 것입니다.");
                Dval11.setText("머리는 쐐기꼴이며, 몸통은 비교적 짧습니다. 꼬리와 귀는 짧은데, 보통 꼬리는 생후 일주일 이내에, 귀는 생후 2~4개월에 잘라줍니다. 털은 짧고 흑색 ·적색 ·청색의 3가지 빛깔로 되어 있습니다.");
                Dval12.setText("부분탈모, 농피증, 모포충증, 습진 등의 피부병이 나타납니다. 유전적인 질병으로는 척추활탈증, 뼈형성부전, 신형선부전등이 알려져 있습니다. 비만이나 고관절 형성장애, 눙의 이상과 같은 흔한 질병뿐아니라 심장병도 지니기 쉽습니다. 또한 짧은 털때문에 저온에 노출되면 안됩니다.");
                Dval13.setText("단 어리광이 심하거나 훈련이 부족하면 단순한 난폭꾼이 되어버립니다. 일단 그렇게 되면 공격적인 면이 드러나므로 훈련소 등에 맡기는 것이 좋습니다.");
                break;
            case "15" :
                Dogimg.setImageResource(R.drawable.d015);
                DogName.setText("시바견");
                Dval1.setText("수컷 38.5~41.5cm・암컷 35.5~38.5cm");
                Dval2.setText("9~14kg");
                Dval3.setText("일본(혼슈, 시코쿠의 산악지대)");
                Dval4.setText("주인 생각이 극심한 충견으로 경계심이 강하다.");
                Dval5.setText("피부질환");
                Dval6.setText("추위에 매우 강한 견종이다. 눈 속에서 자도 멀쩡하다.");
                Dval7.setText("30분 x 2");
                Dval8.setText("솔 브러시");
                Dval9.setText("일본을 대표하는 개로, 특히 영국과 유럽 각국의 도그쇼에 상당수의 개체가 참가하고 있을 만큼 일본은 물론 해외에서도 매우 인기가 높습니다. 해외에서의 호칭도 역시 ‘시바견’입니다. 고온다습하면서도 겨울에는 추위가 심한 일본의 사계절 기후에 알맞게 매우 튼튼한 견종이지만, 최근에는 무분별한 번식으로 경계심이 강하고 신경질적이며 헛울음이 많고 공격적인 개체도 증가하고 있습니다.");
                Dval10.setText("시바견은 아주 복잡한 성격을 가진 개라고 할 수 있습니다. 대담하고 행동력이 있지만 냉정한 판단력이 있습니다. 또한 일찍이 작은 사냥개로서 일본인의 생활과 깊은 관련을 맺어왔으며, 그 때문에 아주 영리하고 순종적이며 용감합니다.");
                Dval11.setText("시바는 일본의 개 중에서 가장 몸집이 작습니다. 그러나 예리하고 사나운 용모를 갖고 있으며, 특히 늠름한 옆얼굴이 매력적인 견종입니다.");
                Dval12.setText("기본적으로 시바는 건강한 개입니다. 단, 평소의 손질과 청결한 환경을 만들어 주는 것이 필요합니다. 일상적인 손질로 산책에서 돌아온 뒤에는 슬리커 브러시로 오물과 빠진 털을 제거해주고, 미지근한 물에 적신 수건을 꼭 짜서 몸을 닦아줍니다. 이렇게 하면 혈액순환이 좋아지면 털에 윤기를 주는 효과가 있습니다. 봄·가을의 털갈이 시기, 즉 환모기에는 특히 피부병 예방을 위해 브러싱 하는 것을 잊지 말아야 합니다. 또 정기적으로 거즈나 칫솔로 치구를 닦아내 이를 건강하게 유지시켜주는 것도 중요합니다.\n");
                Dval13.setText("민첩하고 활동적인 시바견에게는 일일운동량을 거르지 않아야 합니다. 반려인과 함께 산책하고 행동하면서 최고의 만족감과 충실감을 느끼기 때문입니다. 매일 다양한 산책 코스로 변화를 준다면 함께 놀라거나 감동하는 등 여러 가지 체험을 공유할 수 있을 것입니다. 또한 충성스럽고 복종심이 있기 때문에 훈련이 쉽습니다.");
                break;
        }

    }
}
