package by.it.group151002.bobrik.lesson01;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class Lesson1Test {
    /*
    для прохождения тестов создайте JUnit-конфигурацию на свой пакет:
    Поля:
    Name:               Test a_khmelev (тут ваша фамилия)
    Test kind:          All in package
    Package:            by.it.группа.a_khmelev (тут ваша фамилия)
    Search for test:    In whole project
    */

    @Test(timeout = 2000)
    public void slowA() throws Exception {
        FiboA fibo=new FiboA();
        BigInteger res=fibo.slowA(33);
        boolean ok=res.toString().equals("3524578");
        assertTrue("slowA failed", ok);

        res = fibo.slowA(37);
        ok = res.toString().equals("24157817");
        assertTrue("slowA failed", ok);

        res = fibo.slowA(0);
        ok = res.toString().equals("0");
        assertTrue("slowA failed", ok);

        res = fibo.slowA(1);
        ok = res.toString().equals("1");
        assertTrue("slowA failed", ok);

        res = fibo.slowA(20);
        ok = res.toString().equals("6765");
        assertTrue("slowA failed", ok);
    }

    @Test(timeout = 2000)
    public void fastB() throws Exception {
        FiboB fibo=new FiboB();
        BigInteger res=fibo.fastB(55555);
        boolean ok=res.toString().equals("909639027887347144342941161985282559355604430178183350584743748717027366542263454115774180457764119361178818065700599781605301031045912765958497937280143381078273858129564496371971635030388750211987018878594019122081608369859944055268290173661554656988657518473325524758272795937728604044464542075109647906732003650134988406067095491300374765088995480882968323512392912312617101227083974431097843457164074034436313773650841482061774891287543184545319371770727639363930224382008732215830209082100766659544448480462507899357524202479150382770774225865911940587951107025348123733528069313663520384501512487053755021582416432850008389098306703752469001379572433690896114640467636745086253877163269201080071042494668988577461564455432769254924713162146595798906578795216402666025860799868329860419563359713651103025221898184983333267778823082367482711242103128392639556863537102898301584759995002143070624597894698442040541110354780977822565822171878905836685636670318316609386609202981350416675502168926283222103319258798073524908331967335663739592708768575160693887587735383269058895502334974804209475257196644182183401092327147491379059823962903951993250290841961188457640918400772385828052455203308446497850522876608528180685531168473225828714565131444729283223699444503340482790428257563981286491892991033660246616024417941332506656689310748059549811484339433261117033259300500652902600115830724750452473301964550639144809470925781705205968970158308389657887649940883753804405196006995646957204750059695355436194123493457393941168645210746811798866778101896550299432514806643837980851710824081612727110722903372833776910411007619235864817126801702604065158334293916156858599848629086275942621396162424197955746781438271034399002200063411918796452136003564078905058991463355510592166377559715763614721727528762174985396734474738268089578234506515167275375031138709799221183193411830728781110315375410911538679192274012094572237862077799468940063396469472599562545280819613024692324290422417839590915081207851260450836509701986374443916520141544165383083153839035877261659612382394632908007237421298532631111604945472400580867112299736836453942883040919301426094366040263165816911324753683371254510146219312091798708493014082923046997229461410584400431963646196252695714577178308225591412910064716932858200159965282243561088622912391823483428553478212367172161995145427807648571543023538682011236247367500274357118969986946537681049847626833132626372331564775657970641545523598392909167955481457119817830082623455816062894209540469687455385575569476674039940711008474204307994961300581065435298861539733935163376567922721517142143870693595730772685170607264169021390358395399881188502427638248182477340230104522058037488718549609599732273262380107970103277852454079585014822446529907617554793888590318212831222877218400569978891912384375052727128718524934694661093439843049535858173127778867554834009090803582310094817387989046072275124327174453547387528618636253514292557730838237832283956847317251403978580909937787351429711078779176486954188835695627800987961493008146727150524700479682194654092491230343705472375989711563194519597413676122218700696331903370014042611855683236265661719277254818697403919130430082970613330085512630581993711275159086521623909671751050921361703343681699299208222210483191228642778043551720776161308201536353678451006349284573330815487139659744321673584559584535627067439581010081475569270508585650460599634412977833754040474620298291660929317207989213615847996337996513194412889319901026696279249614618048263112515523015028139115642407637494547067374364469154787640932535093313030524973284071847837684736975960823366826524971915596117141751173539262729086663116346365870365304961139616265531459119026052533301468820910319585978974579222551497319612280250272156600439579462572938175236818419213102577039797603964012311447121482962605776496764124907797045802761239464920829449200700588088226581890821754119528698448992492281777980743978405757962977498730099652422271747491916518058732412727393295412382217561015709276476265222622439458716140712781458897230945546868329928230421054584160200580399770646730181726541248601424838093255137542059863632032681191155464626810329003052450414902087133451713656344971266301306286598384154530437443195904584793667201486293909822730384866567403589855617148472976331377475537071340992696406582003033494858455633469855189854940169584255295881044283926177924571700029807536243414753698785712283199281467324771044558885623524634519934706960773040035641679891564766888028735640301056231364309188747975235305086820099619101194834477655410300908530799568056341467135959865163012148879799637372073120238334002164083141825552383359986157349055506671454613969971250993197318896380371736044700678686839058532742550672100148762502462567690393928229862990414662283465195719969681192925317147860433332662900777435695885742702980153579468077090503778385793045257952950939571400815755338835778252681311651211593423223271033820090662697446363417460923662250393808376533067948734141461696784826857742355326481531786608713950657208084344938550518227245946447950939511777299612416771729542414142576982603181588548594463903119620377875737240585329354450191149476257004704220396218896372972566563146603173395844213465455964339975758771738916022135628159697749562375309032256886577396168475827194326636777935421248710464612589191850097913011941826600916151746153573160932425356307913018103818572231771494548545466579668290240407141870360876562951856602444500777026852071846553257362419622464288697450580933026516503035014339009765843791821196411312165393747945504793993299751422908151987854767765817269975642144761884958625379183412350880981868626565168326052339532680197197858200204765140560748809378804767059034896306912874114267381150013577312431115293222274051955700161995353499107308739432654491665121139862651022220977402790694292313265157926210586554304669753789549742695475816403068323026643883659608102895106663954928507274638709413715276973722234800924968628551339593194656950666233178329230171300171790896760977977600703054490908033779919061417430767972754011226620011447787770040516989025818170004928836489506904080580895410790729678817790554829402807415722829064048804325214048768867868973205447913321185017203366768134124893876478106169409068166845256345603614755952200995450506503253096322589741111272573860520318560975126951189832398691354790155624215487306220430798632050226044082813297278674533852360615715272471146505997831814294373508289575689863926936157018562847403666957893046474794231832245767915764950463063819418934599036046132748550708580576092027307732454889200961677384186109536709266079853985476523531346415464941229194954505563092687327971602994597871986901655705546866430975791120173653270445491788176467125447014593030142811426624156667284237606937924697282519593068350824281461162360460317917445333603270404304171598255866616988625308545480547154998052222643657711174682277414701792789234550398444243563783350442559055541908269576447978400898556078854184975313420863644992336418260123115661138641838759121980922980182746613943486465087534850232586744133841747636710046314846745831670994098779580524422809535845883196541125925818027934524935795767942477297350167199511158722375729298143275562777989210939237729459500581200151961622610294719193912857664983695747089418077848341842747479353605964240934175117419680043821686563473525770356986897633945931996114027441293993666079903771862622785438928626113923911063936627869681173024996982573602392657779169262900509896269475824282258512914113759956518014684249546781380028633024426568315690423091176078448062494938618353795856287157761500396653963545510376826468285937461198717614785486284331624856379761950342941444039902439629145470393835639847926115014167679471960937462655579715056840092791540700933617938096273282334596764346928341223024309869218051536398537753802101110929837955769236103813869055495099703262883409012041761848724021333195454659951646980359421677064210706863660168861016236559537365045396235129819997695240203563639949785452598555874284145741040777257331880614743732438162252284147764148035005741554344546279394472438931324820288026274519808242693869080414444386675028918373153401490768380843351848427113619478744126210371863122440093613655447577113249000267942356307385248399435895311440865406541769774462963106844269995751111165312365889148985270030844877174359429336511675454861607078483687194200066090642719223093576427110150588110262193847157421102306411197089273574347086542400800528633585357786827095878525421498709518886724470954005978197906964718477002198987643283664577833752291238017460379354661683518044119258658196403688119863911001969457493498416088591539522805271419678746763581838734245715754721462086955985058439722368277588862050210922965588458008390805204826682386085423655836350934031315253436248696684634375070218291996645101785894679972053232999268463391792491397202598698532549209306038407089389170814042190047516687465343718894057618663112796109731136276137806006584813314845139426531979308355804915578565990413773376631453799855137038090741773508055133822860525243513283527061589059172286453679441998352714513650394795295105354986943863982582202530167265532500296148726539153598148766840870641239364617379750315388889503569004926351420656298789603645728951021324352143042614674039251422115798697547713631123807698993164925645374669805460077809276103954476896034509625394385947204050185217855524099622360537052794654126314130181596293144127267509390351018246614606419621608169991253167324318111584118384187873077324332235101472978837059697059900874239444989224012834638657187726461799190254373145224070507453490923444230916867959017257447376941662132028194306992196255147173779906789871155483492726999503177894814033511619479083908698457989598370495012644118329516819853330226633565412918634998283088126395380398793476716953835254592257031565790616613525000495203746662094756817245475391242659231997308097443779983219354573130426611778478692593591583617546914799296804525789713206912214531267052339211190112282721627175290941677106804596492543428294900573560468271465025689687105084668468189619639767716888486300937738962512530217833483251969414978948838418010674059964119031192844349921473189890333562644298871733567268178369507713139770414787297439886671772253317004726358040061068277570898528015355478563278532031290793232443681316564577939942167329056757668531416126638187915973262788310855346242953743907089052889700419942324397362425606941409727506690635964020154837089838696081484461121904400568295520716383595963400635719347742258457380004078279995058218236192428143853631277927475108860128155160872714269943851277340373266639438556500597050794352027301766865935883146777193359759064506577499692945142961399847185363846035489411916728005190125133620051680304062592494005371056113711295667563242745476125963220775394209187567930808056120453037041093082967574251679712066113534102230967327013521657561065451643719451653530724205229681371200152912780481428209508316270189500076121582841081399695808147375164707080761193903187755870846758109462933355019372529492513155055378096677369110652175673711075578590299120574710961154283757840850882013305753689311953733654090859881700093223315641073455810767834119285376879100652544381617590818383118661851414962612809756947753199125171502545556831799322789170241148215338109963325425668997935546328658765991089842850466571454347611327119513293519489362335958179174105025034828099588669105077499597365168880387075676110356654357331280261235167283832661443727354497944795910894953884419939619445");
        assertTrue("fastB failed", ok);

        res = fibo.fastB(100000);
        ok = res.toString().equals("2597406934722172416615503402127591541488048538651769658472477070395253454351127368626555677283671674475463758722307443211163839947387509103096569738218830449305228763853133492135302679278956701051276578271635608073050532200243233114383986516137827238124777453778337299916214634050054669860390862750996639366409211890125271960172105060300350586894028558103675117658251368377438684936413457338834365158775425371912410500332195991330062204363035213756525421823998690848556374080179251761629391754963458558616300762819916081109836526352995440694284206571046044903805647136346033000520852277707554446794723709030979019014860432846819857961015951001850608264919234587313399150133919932363102301864172536477136266475080133982431231703431452964181790051187957316766834979901682011849907756686456845066287392485603914047605199550066288826345877189410680370091879365001733011710028310473947456256091444932821374855573864080579813028266640270354294412104919995803131876805899186513425175959911520563155337703996941035518275274919959802257507902037798103089922984996304496255814045517000250299764322193462165366210841876745428298261398234478366581588040819003307382939500082132009374715485131027220817305432264866949630987914714362925554252624043999615326979876807510646819068792118299167964409178271868561702918102212679267401362650499784968843680975254700131004574186406448299485872551744746695651879126916993244564817673322257149314967763345846623830333820239702436859478287641875788572910710133700300094229333597292779191409212804901545976262791057055248158884051779418192905216769576608748815567860128818354354292307397810154785701328438612728620176653953444993001980062953893698550072328665131718113588661353747268458543254898113717660519461693791688442534259478126310388952047956594380715301911253964847112638900713362856910155145342332944128435722099628674611942095166100230974070996553190050815866991144544264788287264284501725332048648319457892039984893823636745618220375097348566847433887249049337031633826571760729778891798913667325190623247118037280173921572390822769228077292456662750538337500692607721059361942126892030256744356537800831830637593334502350256972906515285327194367756015666039916404882563967693079290502951488693413799125174856667074717514938979038653338139534684837808612673755438382110844897653836848318258836339917310455850905663846202501463131183108742907729262215943020429159474030610183981685506695026197376150857176119947587572212987205312060791864980361596092339594104118635168854883911918517906151156275293615849000872150192226511785315089251027528045151238603792184692121533829287136924321527332714157478829590260157195485316444794546750285840236000238344790520345108033282013803880708980734832620122795263360677366987578332625485944906021917368867786241120562109836985019729017715780112040458649153935115783499546100636635745448508241888279067531359950519206222976015376529797308588164873117308237059828489404487403932053592935976454165560795472477862029969232956138971989467942218727360512336559521133108778758228879597580320459608479024506385194174312616377510459921102486879496341706862092908893068525234805692599833377510390101316617812305114571932706629167125446512151746802548190358351688971707570677865618800822034683632101813026232996027599403579997774046244952114531588370357904483293150007246173417355805567832153454341170020258560809166294198637401514569572272836921963229511187762530753402594781448204657460288485500062806934811398276016855584079542162057543557291510641537592939022884356120792643705560062367986544382464373946972471945996555795505838034825597839682776084731530251788951718630722761103630509360074262261717363058613291544024695432904616258691774630578507674937487992329181750163484068813465534370997589353607405172909412697657593295156818624747127636468836551757018353417274662607306510451195762866349922848678780591085118985653555434958761664016447588028633629704046289097067736256584300235314749461233912068632146637087844699210427541569410912246568571204717241133378489816764096924981633421176857150311671040068175303192115415611958042570658693127276213710697472226029655524611053715554532499750843275200199214301910505362996007042963297805103066650638786268157658772683745128976850796366371059380911225428835839194121154773759981301921650952140133306070987313732926518169226845063443954056729812031546392324981793780469103793422169495229100793029949237507299325063050942813902793084134473061411643355614764093104425918481363930542369378976520526456347648318272633371512112030629233889286487949209737847861884868260804647319539200840398308008803869049557419756219293922110825766397681361044490024720948340326796768837621396744075713887292863079821849314343879778088737958896840946143415927131757836511457828935581859902923534388888846587452130838137779443636119762839036894595760120316502279857901545344747352706972851454599861422902737291131463782045516225447535356773622793648545035710208644541208984235038908770223039849380214734809687433336225449150117411751570704561050895274000206380497967960402617818664481248547269630823473377245543390519841308769781276565916764229022948181763075710255793365008152286383634493138089971785087070863632205869018938377766063006066757732427272929247421295265000706646722730009956124191409138984675224955790729398495608750456694217771551107346630456603944136235888443676215273928597072287937355966723924613827468703217858459948257514745406436460997059316120596841560473234396652457231650317792833860590388360417691428732735703986803342604670071717363573091122981306903286137122597937096605775172964528263757434075792282180744352908669606854021718597891166333863858589736209114248432178645039479195424208191626088571069110433994801473013100869848866430721216762473119618190737820766582968280796079482259549036328266578006994856825300536436674822534603705134503603152154296943991866236857638062351209884448741138600171173647632126029961408561925599707566827866778732377419444462275399909291044697716476151118672327238679208133367306181944849396607123345271856520253643621964198782752978813060080313141817069314468221189275784978281094367751540710106350553798003842219045508482239386993296926659221112742698133062300073465628498093636693049446801628553712633412620378491919498600097200836727876650786886306933418995225768314390832484886340318940194161036979843833346608676709431643653538430912157815543512852077720858098902099586449602479491970687230765687109234380719509824814473157813780080639358418756655098501321882852840184981407690738507369535377711880388528935347600930338598691608289335421147722936561907276264603726027239320991187820407067412272258120766729040071924237930330972132364184093956102995971291799828290009539147382437802779051112030954582532888721146170133440385939654047806199333224547317803407340902512130217279595753863158148810392952475410943880555098382627633127606718126171022011356181800775400227516734144169216424973175621363128588281978005788832454534581522434937268133433997710512532081478345067139835038332901313945986481820272322043341930929011907832896569222878337497354301561722829115627329468814853281922100752373626827643152685735493223028018101449649009015529248638338885664893002250974343601200814365153625369199446709711126951966725780061891215440222487564601554632812091945824653557432047644212650790655208208337976071465127508320487165271577472325887275761128357592132553934446289433258105028633583669291828566894736223508250294964065798630809614341696830467595174355313224362664207197608459024263017473392225291248366316428006552870975051997504913009859468071013602336440164400179188610853230764991714372054467823597211760465153200163085336319351589645890681722372812310320271897917951272799656053694032111242846590994556380215461316106267521633805664394318881268199494005537068697621855231858921100963441012933535733918459668197539834284696822889460076352031688922002021931318369757556962061115774305826305535862015637891246031220672933992617378379625150999935403648731423208873977968908908369996292995391977217796533421249291978383751460062054967341662833487341011097770535898066498136011395571584328308713940582535274056081011503907941688079197212933148303072638678631411038443128215994936824342998188719768637604496342597524256886188688978980888315865076262604856465004322896856149255063968811404400429503894245872382233543101078691517328333604779262727765686076177705616874050257743749983775830143856135427273838589774133526949165483929721519554793578923866762502745370104660909382449626626935321303744538892479216161188889702077910448563199514826630802879549546453583866307344423753319712279158861707289652090149848305435983200771326653407290662016775706409690183771201306823245333477966660525325490873601961480378241566071271650383582257289215708209369510995890132859490724306183325755201208090007175022022949742801823445413711916298449914722254196594682221468260644961839254249670903104007581488857971672246322887016438403908463856731164308169537326790303114583680575021119639905615169154708510459700542098571797318015564741406172334145847111268547929892443001391468289103679179216978616582489007322033591376706527676521307143985302760988478056216994659655461379174985659739227379416726495377801992098355427866179123126699374730777730569324430166839333011554515542656864937492128687049121754245967831132969248492466744261999033972825674873460201150442228780466124320183016108232183908654771042398228531316559685688005226571474428823317539456543881928624432662503345388199590085105211383124491861802624432195540433985722841341254409411771722156867086291742124053110620522842986199273629406208834754853645128123279609097213953775360023076765694208219943034648783348544492713539450224591334374664937701655605763384697062918725745426505879414630176639760457474311081556747091652708748125267159913793240527304613693961169892589808311906322510777928562071999459487700611801002296132304588294558440952496611158342804908643860880796440557763691857743754025896855927252514563404385217825890599553954627451385454452916761042969267970893580056234501918571489030418495767400819359973218711957496357095967825171096264752068890806407651445893132870767454169607107931692704285168093413311046353506242209810363216771910420786162184213763938194625697286781413636389620123976910465418956806197323148414224550071617215851321302030684176087215892702098879108938081045903397276547326416916845445627600759561367103584575649094430692452532085003091068783157561519847567569191284784654692558665111557913461272425336083635131342183905177154511228464455136016013513228948543271504760839307556100908786096663870612278690274831819331606701484957163004705262228238406266818448788374548131994380387613830128859885264201992286188208499588640888521352501457615396482647451025902530743172956899636499615707551855837165935367125448515089362904567736630035562457374779100987992499146967224041481601289530944015488942613783140087804311431741858071826185149051138744831358439067228949408258286021650288927228387426432786168690381960530155894459451808735197246008221529343980828254126128257157209350985382800738560472910941184006084485235377833503306861977724501886364070344973366473100602018128792886991861824418453968994777259482169137133647470453172979809245844361129618997595696240971845564020511432589591844724920942930301651488713079802102379065536525154780298059407529440513145807551537794861635879901158192019808879694967187448224156836463534326160242632934761634458163890163805123894184523973421841496889262398489648642093409816681494771155177009562669029850101513537599801272501241971119871526593747484778935488777815192931171431167444773882941064615028751327709474504763922874890662989841540259350834035142035136168819248238998027706666916342133424312054507359388616687691188185776118135771332483965209882085982391298606386822804754362408956522921410859852037330544625953261340234864689275060526893755148403298542086991221052597005628576707702567695300978970046408920009852106980295419699802138053295798159478289934443245491565327845223840551240445208226435420656313310702940722371552770504263482073984454889589248861397657079145414427653584572951329719091947694411910966797474262675590953832039169673494261360032263077428684105040061351052194413778158095005714526846009810352109249040027958050736436961021241137739717164869525493114805040126568351268829598413983222676377804500626507241731757395219796890754825199329259649801627068665658030178877405615167159731927320479376247375505855052839660294566992522173600874081212014209071041937598571721431338017425141582491824710905084715977249417049320254165239323233258851588893337097136310892571531417761978326033750109026284066415801371359356529278088456305951770081443994114674291850360748852366654744869928083230516815711602911836374147958492100860528981469547750812338896943152861021202736747049903930417035171342126923486700566627506229058636911882228903170510305406882096970875545329369434063981297696478031825451642178347347716471058423238594580183052756213910186997604305844068665712346869679456044155742100039179758348979935882751881524675930878928159243492197545387668305684668420775409821781247053354523194797398953320175988640281058825557698004397120538312459428957377696001857497335249965013509368925958021863811725906506436882127156815751021712900765992750370228283963962915973251173418586721023497317765969454283625519371556009143680329311962842546628403142444370648432390374906410811300792848955767243481200090309888457270907750873638873299642555050473812528975962934822878917619920725138309388288292510416837622758204081918933603653875284116785703720989718832986921927816629675844580174911809119663048187434155067790863948831489241504300476704527971283482211522202837062857314244107823792513645086677566622804977211397140621664116324756784216612961477109018826094677377686406176721484293894976671380122788941309026553511096118347012565197540807095384060916863936906673786627209429434264260402902158317345003727462588992622049877121178405563348492490326003508569099382392777297498413565614830788262363322368380709822346012274241379036473451735925215754757160934270935192901723954921426490691115271523338109124042812102893738488167358953934508930697715522989199698903885883275409044300321986834003470271220020159699371690650330547577095398748580670024491045504890061727189168031394528036165633941571334637222550477547460756055024108764382121688848916940371258901948490685379722244562009483819491532724502276218589169507405794983759821006604481996519360110261576947176202571702048684914616894068404140833587562118319210838005632144562018941505945780025318747471911604840677997765414830622179069330853875129298983009580277554145435058768984944179136535891620098725222049055183554603706533183176716110738009786625247488691476077664470147193074476302411660335671765564874440577990531996271632972009109449249216456030618827772947750764777446452586328919159107444252320082918209518021083700353881330983215894608680127954224752071924134648334963915094813097541433244209299930751481077919002346128122330161799429930618800533414550633932139339646861616416955220216447995417243171165744471364197733204899365074767844149929548073025856442942381787641506492878361767978677158510784235702640213388018875601989234056868423215585628508645525258377010620532224244987990625263484010774322488172558602233302076399933854152015343847725442917895130637050320444917797752370871958277976799686113626532291118629631164685159934660693460557545956063155830033697634000276685151293843638886090828376141157732003527565158745906567025439437931104838571313294490604926582363108949535090082673154497226396648088618041573977888472892174618974189721700770009862449653759012727015227634510874906948012210684952063002519011655963580552429180205586904259685261047412834518466736938580027700252965356366721619883672428226933950325930390994583168665542234654857020875504617520521853721567282679903418135520602999895366470106557900532129541336924472492212436324523042895188461779122338069674233980694887270587503389228395095135209123109258159006960395156367736067109050566299603571876423247920752836160805597697778756476767210521222327184821484446631261487584226092608875764331731023263768864822594691211032367737558122133470556805958008310127481673962019583598023967414489867276845869819376783757167936723213081586191045995058970991064686919463448038574143829629547131372173669836184558144505748676124322451519943362182916191468026091121793001864788050061351603144350076189213441602488091741051232290357179205497927970924502479940842696158818442616163780044759478212240873204124421169199805572649118243661921835714762891425805771871743688000324113008704819373962295017143090098476927237498875938639942530595331607891618810863505982444578942799346514915952884869757488025823353571677864826828051140885429732788197765736966005727700162592404301688659946862983717270595809808730901820120931003430058796552694788049809205484305467611034654748067290674399763612592434637719995843862812391985470202414880076880818848087892391591369463293113276849329777201646641727587259122354784480813433328050087758855264686119576962172239308693795757165821852416204341972383989932734803429262340722338155102209101262949249742423271698842023297303260161790575673111235465890298298313115123607606773968998153812286999642014609852579793691246016346088762321286205634215901479188632194659637483482564291616278532948239313229440231043277288768139550213348266388687453259281587854503890991561949632478855035090289390973718988003999026132015872678637873095678109625311008054489418857983565902063680699643165033912029944327726770869305240718416592070096139286401966725750087012218149733133695809600369751764951350040285926249203398111014953227533621844500744331562434532484217986108346261345897591234839970751854223281677187215956827243245910829019886390369784542622566912542747056097567984857136623679023878478161201477982939080513150258174523773529510165296934562786122241150783587755373348372764439838082000667214740034466322776918936967612878983488942094688102308427036452854504966759697318836044496702853190637396916357980928865719935397723495486787180416401415281489443785036291071517805285857583987711145474240156416477194116391354935466755593592608849200546384685403028080936417250583653368093407225310820844723570226809826951426162451204040711501448747856199922814664565893938488028643822313849852328452360667045805113679663751039248163336173274547275775636810977344539275827560597425160705468689657794530521602315939865780974801515414987097778078705357058008472376892422189750312758527140173117621279898744958406199843913365680297721208751934988504499713914285158032324823021340630312586072624541637765234505522051086318285359658520708173392709566445011404055106579055037417780393351658360904543047721422281816832539613634982525215232257690920254216409657452618066051777901592902884240599998882753691957540116954696152270401280857579766154722192925655963991820948894642657512288766330302133746367449217449351637104725732980832812726468187759356584218383594702792013663907689741738962252575782663990809792647011407580367850599381887184560094695833270775126181282015391041773950918244137561999937819240362469558235924171478702779448443108751901807414110290370706052085162975798361754251041642244867577350756338018895379263183389855955956527857227926155524494739363665533904528656215464288343162282921123290451842212532888101415884061619939195042230059898349966569463580186816717074818823215848647734386780911564660755175385552224428524049468033692299989300783900020690121517740696428573930196910500988278523053797637940257968953295112436166778910585557213381789089945453947915927374958600268237844486872037243488834616856290097850532497036933361942439802882364323553808208003875741710969289725499878566253048867033095150518452126944989251596392079421452606508516052325614861938282489838000815085351564642761700832096483117944401971780149213345335903336672376719229722069970766055482452247416927774637522135201716231722137632445699154022395494158227418930589911746931773776518735850032318014432883916374243795854695691221774098948611515564046609565094538115520921863711518684562543275047870530006998423140180169421109105925493596116719457630962328831271268328501760321771680400249657674186927113215573270049935709942324416387089242427584407651215572676037924765341808984312676941110313165951429479377670698881249643421933287404390485538222160837088907598277390184204138197811025854537088586701450623578513960109987476052535450100439353062072439709976445146790993381448994644609780957731953604938734950026860564555693224229691815630293922487606470873431166384205442489628760213650246991893040112513103835085621908060270866604873585849001704200923929789193938125116798421788115209259130435572321635660895603514383883939018953166274355609970015699780289236362349895374653428746875");
        assertTrue("fastB failed", ok);

        res = fibo.fastB(0);
        ok = res.toString().equals("0");
        assertTrue("fastB failed", ok);

        res = fibo.fastB(1);
        ok = res.toString().equals("1");
        assertTrue("fastB failed", ok);

        res = fibo.fastB(20);
        ok = res.toString().equals("6765");
        assertTrue("slowA failed", ok);

        res = fibo.fastB(37);
        ok = res.toString().equals("24157817");
        assertTrue("slowA failed", ok);
    }


    @Test(timeout = 2000)
    public void fasterC() throws Exception {
        FiboC fibo=new FiboC();
        assertTrue("fasterC failed 1", fibo.fasterC(10,2)==1L);
        assertTrue("fasterC failed 2", fibo.fasterC(1,2)==1L);
        assertTrue("fasterC failed 3", fibo.fasterC(999999999,321)==34L);
        assertTrue("fasterC failed 4", fibo.fasterC(1, 100000000) == 1L);
        assertTrue("fasterC failed 5", fibo.fasterC(17, 8) == 5L);
        assertTrue("fasterC failed 6", fibo.fasterC(9, 7) == 6L);
    }
}
