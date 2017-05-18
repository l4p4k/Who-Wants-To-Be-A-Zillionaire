import java.util.ArrayList;

/**
 * 
 */

/**
 * this constructor doesn't take any parameters as it only sets up the arraylists
 * @author Ebrahim
 */
public class Question {
	private int index;
	private String question;
	private String correctAns;
	private String wrongAns1;
	private String wrongAns2;
	private String wrongAns3;

	//3 different arraylists for 3 different difficulty of questions
	ArrayList<Question> easyQuizList = new ArrayList<Question>();
	ArrayList<Question> normalQuizList = new ArrayList<Question>();
	ArrayList<Question> hardQuizList = new ArrayList<Question>();

	public Question(int index, String question, String correctAns, String wrongAns1, String wrongAns2, String wrongAns3) {
		this.index = index;
		this.question = question;
		this.correctAns = correctAns;
		this.wrongAns1 = wrongAns1;
		this.wrongAns2 = wrongAns2;
		this.wrongAns3 = wrongAns3;
	}

	//constructor with array list of questions according to their difficulty are added
	public Question() {
		//General Knowledge ========================================================================================================================
		easyQuizList.add(new Question(easyQuizList.size(),"What is the fastest land animal on Earth?","Cheetah","Peregrine falcon","Hedgehog","Lion"));
		easyQuizList.add(new Question(easyQuizList.size(),"What is the heaviest metal?","Osmium","Iron","Silver","Gold"));
		easyQuizList.add(new Question(easyQuizList.size(),"What is Aurora Borealis commonly known as?","Northern Lights","A famous polish polititian","A famous cruise ship","An element from the periodic table"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which is the sport wherein you would use a 'sand iron'?","Golf","Archery","Rugby","Boxing"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which famous person was the teddy bear named?","Theodore Roosevelt","Teddy Sheringham","Thomas Jefferson","Mark Wahlberg"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which is the country with the most people?","China","India","Russia","America"));
		easyQuizList.add(new Question(easyQuizList.size(),"What is the well-known Malay word for 'person of the forest'?","Orangutan","Monyet","Beruk","Wanita"));

		normalQuizList.add(new Question(normalQuizList.size(),"What is the heavenly Greek word for messenger?","Angel","Prophet","Envoy","Harbinger"));
		normalQuizList.add(new Question(normalQuizList.size(),"How many squares/spaces on a chess board?","64","100","80","81"));
		normalQuizList.add(new Question(normalQuizList.size(),"What is currently the UK's longest continuous running game show?","Countdown","Who wants to be a millionaire?","Mastermind","Strictly come dancing"));
		normalQuizList.add(new Question(normalQuizList.size(),"What is the well-known Sanskrit word for 'great soul'?","Mahatma","Baghwan","Farishta","Lakshmi"));
		normalQuizList.add(new Question(normalQuizList.size(),"Which make of rifle was the standard infantry weapon of the US Army from 1873 to 1936??","Springfield","Musket","Lee Enfield","M1 Garand"));
		normalQuizList.add(new Question(normalQuizList.size(),"What nickname is shared by a Nationwide football team and an England footballer's wife?","Posh","Amber","Hazel","Liberty"));
		normalQuizList.add(new Question(normalQuizList.size(),"Entomology is the science that studies","Insects","Behavior of human beings","The origin and history of technical and scientific terms","The formation of rocks"));

		hardQuizList.add(new Question(hardQuizList.size(),"The word biscuit stems from the Latin 'bis coctum'. What does 'bis coctum' mean?","Twice baked","Hard cake","Crumbly cake","Sweet pastry"));
		hardQuizList.add(new Question(hardQuizList.size(),"What colour is the Central Line on a London Underground map?","Red","Yellow","Green","Blue"));
		hardQuizList.add(new Question(hardQuizList.size(),"The ELO system is used to rank players in which game??","Chess","Basketball","Boxing","Connect four"));
		hardQuizList.add(new Question(hardQuizList.size(),"Who performs the resounding waggledance??","Honey Bees","Cockatoos","The peacock spider","The manakin bird "));
		hardQuizList.add(new Question(hardQuizList.size(),"What kind of weapon is found on the flag of the Barbados?","Trident","Hammer","Bow and Arrow","Spear"));
		hardQuizList.add(new Question(hardQuizList.size(),"Havana Brown, Korat and Burmilla are all examples of what?","Cat breeds","Dog breeds","Birds","Snakes"));
		hardQuizList.add(new Question(hardQuizList.size(),"Exposure to sunlight helps a person improve his health because..?","the ultraviolet rays convert skin oil into Vitamin D","the infrared light kills bacteria in the body","resistance power increases","the pigment cells in the skin get stimulated and produce a healthy tan"));

		//Computing ========================================================================================================================
		easyQuizList.add(new Question(easyQuizList.size(),"What language does the computer use and understand?","Machine code","Assembly code","Software code","Windows"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which of these memory is the largest?","1TB","1GB","10MB","55000Bytes"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which of these is the brains of a computer?","CPU","ALU","GPU","PSU"));
		easyQuizList.add(new Question(easyQuizList.size(),"As compared to diskettes, the hard disks are...?","more expensive","more portable","less rigid","slowly accessed"));
		easyQuizList.add(new Question(easyQuizList.size(),"The first microprocessors produced by Intel Corpn. and Texas Instruments were used primarily to control?","calculators","microwave ovens","washing machines","robotics"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which printer uses a combination of laser-beam & electro photographic techniques?","Laser printers","Dot-Matrix","Line printer","Daisy wheel"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which of the following is still useful for adding numbers?","Abacus","EDSAC","ENIAC","UNIVAC"));

		normalQuizList.add(new Question(normalQuizList.size(),"What decimal number is represented by the binary number 101010?","42","52","21","85"));
		normalQuizList.add(new Question(normalQuizList.size(),"how many megabytes is a terabit?","131072","1048576","8388608","134217728"));
		normalQuizList.add(new Question(normalQuizList.size(),"Apple Computer co-Founder Steve Jobs famously studied what degree subject at Reed College in Portland?","Calligraphy","Computer Engineering","Publishing","Marketing"));
		normalQuizList.add(new Question(normalQuizList.size(),"Requiring 800,000 hours to generate all the images, what 1995 film was the first fully computer generated full length feature film?","Toy Story","Superman","Tron","Casper"));
		normalQuizList.add(new Question(normalQuizList.size(),"The section of the CPU that selects, interprets and sees to the execution of program instructions is?","Control unit","Register unit","Memory","ALU"));
		normalQuizList.add(new Question(normalQuizList.size(),"The term referring to evacuating the content of some part of the machine is known as?","Dump","Enhancement","Down","Compiler"));
		normalQuizList.add(new Question(normalQuizList.size(),"What difference does the 5th generation computer have from other generation computers?","Technological advancement","Scientific code","Object Oriented Programming","None"));

		hardQuizList.add(new Question(hardQuizList.size(),"The Memory Buffer Register (MBR)...","contains a copy of the designated memory location specified by the MAR after a 'read' or the new contents of the memory prior to a 'write'.","is a hardware memory device which denotes the location of the current instruction being executed.","contains the address of the memory location that is to be read from or stored into.","None of the above"));
		hardQuizList.add(new Question(hardQuizList.size(),"The tracks on a disk which can be accessed without repositioning the R/W heads is?","Cylinder","Surface","Cluster","This is not possible"));
		hardQuizList.add(new Question(hardQuizList.size(),"A single packet on a data link is known as?","Frame","Path","Block","Group"));
		hardQuizList.add(new Question(hardQuizList.size(),"A common boundary between two systems is called?","Interface","Interdiction","Surface","BIOS"));
		hardQuizList.add(new Question(hardQuizList.size(),"How many bit code is used by Murray code for TELEPRINTER machines?","5","4","7","15"));
		hardQuizList.add(new Question(hardQuizList.size(),"The microcomputer, Intel MCS-80 is based on the widely used Intel?","8080 microprocessor","8085 microprocessor","8086 microprocessor","8082 microprocessor"));
		hardQuizList.add(new Question(hardQuizList.size(),"A computer assisted method for the recording and analyzing of existing or hypothetical systems is?","Data flow","Data transmission","Data processing","None of these"));

		//Science and Nature ========================================================================================================================
		easyQuizList.add(new Question(easyQuizList.size(),"Which scientific word translated means 'disease producer'?","Pathogen","Virus","Bacteria","Petri"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which one of the following is an example of non-renewable resources?","Coal and minerals","Wind","Water","Vegetation"));
		easyQuizList.add(new Question(easyQuizList.size(),"_____ of stratosphere provides protection to our life.","Ozone","Hydrogen","Nitrogen","Argon"));
		easyQuizList.add(new Question(easyQuizList.size(),"The life supporting gases such as O2, CO2 and N2 are chiefly concentrated in the...?","troposphere","exosphere","homosphere","stratosphere"));
		easyQuizList.add(new Question(easyQuizList.size(),"Which of the following soil is the best for plant growth??","Loamy soil","Gravel","Clay","Sandy soil"));
		easyQuizList.add(new Question(easyQuizList.size(),"What is the major raw material for bio gas?","Cow dung","Plant leaves","Grass","Mud"));
		easyQuizList.add(new Question(easyQuizList.size(),"At room temperature, most elements are in which phase of matter?","solid","liquid","gas","plasma"));

		normalQuizList.add(new Question(normalQuizList.size(),"In an EMP bomb, what do the letters E M P stand for?","Electro Magnetic Pulse","Energy Magnetic Pulse","Electro Meteroric Power","Energetic Magnetic Pulse"));
		normalQuizList.add(new Question(normalQuizList.size(),"Which animals' name literally means river horse?","Hippopotamus","Seahorse","Leafy Sea Dragon","Longhorn Cowfish"));
		normalQuizList.add(new Question(normalQuizList.size(),"Bees must collect nectar from approximately how many flowers to make 1 pound of honeycomb?","20 million","50 million","2 million","10 thousand"));
		normalQuizList.add(new Question(normalQuizList.size(),"The branch of medical science which is concerned with the study of disease as it affects a community of people is called?","epidemiology","oncology","paleontogy","pathology"));
		normalQuizList.add(new Question(normalQuizList.size(),"In which country was a method for making rust-resistant iron discovered in the fifth century B.C.?","India","Egypt","Sumeria","Babylon"));
		normalQuizList.add(new Question(normalQuizList.size(),"Compared to terrestrial environments, aquatic environments are more stable in?","temperature range","Producer consumer distribution","Sunlight absorbed","Number species"));
		normalQuizList.add(new Question(normalQuizList.size(),"Which of the following is used in beauty parlours for hair setting?","Sulphur","Chlorine","Silicon","Phosphorus"));

		hardQuizList.add(new Question(hardQuizList.size(),"It was formerly known as Brimstone, what is it now called?","Sulphur","Limestone","Marble","Sandstone"));
		hardQuizList.add(new Question(hardQuizList.size(),"Pollination by birds is called?","ornithophily","autogamy","entomophily","anemophily"));
		hardQuizList.add(new Question(hardQuizList.size(),"Albacore is a type of?","Tuna","marble","meteoroid","shell-fish"));
		hardQuizList.add(new Question(hardQuizList.size(),"Who was the marine biologist and author of Silent Spring who was one of the first people to warn of the dangers of pesticides like DDT?","RACHEL CARSON","Marlin Perkins","Charles Darwin","Jacques Cousteau"));
		hardQuizList.add(new Question(hardQuizList.size(),"The most abundant organic molecule on the surface of the Earth is?","cellulose","chitin","DNA","hemoglobin"));
		hardQuizList.add(new Question(hardQuizList.size(),"A radio station is broadcasting at 3750 khz (kilohertz). This station would be found in which radio band?","20 meter","40 meter","80 meter","160 meter"));
		hardQuizList.add(new Question(hardQuizList.size(),"The half life of tritium is about?","12.3 years","3,500 years","40 years","3.7 years"));

	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @return the correct answer
	 */
	public String getCorrectAns() {
		return correctAns;
	}
	/**
	 * @return the first wrong answer
	 */
	public String getWrongAns1() {
		return wrongAns1;
	}
	/**
	 * @return the second wrong answer
	 */
	public String getWrongAns2() {
		return wrongAns2;
	}
	/**
	 * @return the third wrong answer
	 */
	public String getWrongAns3() {
		return wrongAns3;
	}
}
