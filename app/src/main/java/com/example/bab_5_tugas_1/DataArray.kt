import com.example.bab_5_tugas_1.R

object DataArray { //untuk menampung data array

    private val languages = listOf("Ir. Soekarno", "Soeharto", "B.J. Habibie", "Abdurrahman Wahid", "Megawati", "SBY", "Jokowi")
    //muntuk mendeklarasikan listOf()string

    val desk = listOf(
        "Ir. soekarno adalah Presiden pertama Republik Indonesia. Dia adalah bapak proklamator.",
        "Soeharto adalah Presiden kedua Republik Indonesia. Pada masa pemerintahannya terjadi reformasi.",
        "BJ Habibie adalah Presiden ketiga Republik Indonesia. Habibie menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998.",
        "Abdurrahman Wahid adalah Presiden keempat Republik Indonesia. Akrab disapa Gus Dur adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001.",
        "Megawati adalah Presiden kelima Republik Indonesia. Dia merupakan seorang presiden wanita.",
        "SBY atau Susilo Bambang Yudhoyono adalah Presiden keenam Republik Indonesia.",
        "Jokowi adalah Presiden ketujuh Republik Indonesia. Pada masa pemerintahannya banyak sekali terjadi krisis ekonomi dan berbagai faktor yang merugikan rakyat seperti revisi RUUKUHP. Banyak sekali konspirasi yang terjadi pada masa pemerintahannya. Namun ada sekelompok oknum yang masih berusaha melindungnya agar tidak dilengserkan."
    )

    private val pictDat = intArrayOf( //untuk mendeklarasikan gambar harus menggunakan IntArrayOf()
        R.drawable.sukarno,
        R.drawable.suharto,
        R.drawable.habibi,
        R.drawable.wahid,
        R.drawable.megawati,
        R.drawable.susilo,
        R.drawable.jokowi
    )

    val listData: ArrayList<GetSetArray> //mengoper data pada class GetSetArray
        get() {
            val list = arrayListOf<GetSetArray>()  //mendeklarasikan data array sebagai list
            for (position in languages.indices) { //perulangan untuk mengisi data ke GetSetArray
                val listDat = GetSetArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list //mengembalikan data untuk mengirim ke GetSetArray
        }
}