fun main(args: Array<String>) {

    arrayOf(
        "Informed Consent Ortodontik",
        "Model Studi",
        "Panoramik",
        "Sefalometri",
        "Fotografi EO",
        "Fotografi IO",
    ).forEach {
        tab2("a", it)
    }

//    arrayOf(
//        D("a", arrayOf(
//            "Informed Consent Ortodontik",
//            "Model Studi",
//            "Panoramik",
//            "Sefalometri",
//            "Fotografi EO",
//            "Fotografi IO",
//        )),
//        D("b", arrayOf(
//            "Form Pindah Perawatan",
//            "Model Studi",
//            "Panoramik",
//            "Sefalometri",
//            "Fotografi EO",
//            "Fotografi IO",
//        )),
//        D("c", arrayOf(
//            "Form Persetujuan Debonding",
//            "Model Studi",
//            "Panoramik",
//            "Sefalometri",
//            "Fotografi EO",
//            "Fotografi IO",
//        )),
//    ).forEach {
//        tab2ya(it)
//    }

//    arrayOf(
//        "Wajah",
//        "Bibir",
//        "Dagu",
//        "Profil",
//        "Lainnya",
//    ).forEachIndexed { i, s ->
//        tab3(
//            no = i + 1,
//            txt = s,
//            alfabet = "b",
//            bth = 1
//        )
//    }

//    arrayOf(
//        "Sagital",
//        "Transversal",
//        "Vertikal",
//        "Profil",
//        "Kesejajaran",
//    ).forEachIndexed { i, s ->
//        tab3d(
//            no = i + 1,
//            txt = s,
//        )
//    }
}

class D(
    val d: String,
    val arr: Array<String>
)

fun String.toSnake() = this.toLowerCase().replace(" ", "-")

fun tab2ya(d: D) {
    d.arr.forEach {
        println("""
            ${"$"}f[] = 'tab_2_${d.d}_file_${it.toSnake()}';
    """.trimIndent())
    }
}

fun tab2(alfabet: String, s: String) {

    println("""
                    <div class="form-inline mt2">
                        <div class="form-group">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" id="$alfabet-cx-${s.toSnake()}" name="meta[tab_2][$alfabet][cx-${s.toSnake()}]" <?=${"$"}meta && isset(${"$"}meta['tab_2']['$alfabet']['cx-${s.toSnake()}']) ? 'checked="checked"' : ''?>> $s
                                </label>
                            </div>
                        </div>
                        <div class="form-group pull-right">
                            <input type="file" id="$alfabet-file-${s.toSnake()}" name="tab_2_${alfabet}_file_${s.toSnake()}" class="mt" accept="image/jpeg,image/jpg,image/png,application/pdf" disabled>
                        </div>
                    </div>
                    <?php if (${"$"}meta && isset(${"$"}meta['tab_2']['$alfabet']['file_name_${s.toSnake()}'])) : ?>
                        <a href="<?=base_url()?>upload/orto/<?=${"$"}meta['tab_2']['$alfabet']['file_name_${s.toSnake()}']?>" target="_blank" style="margin-left: 41px">Lihat file</a>
                    <?php endif; ?>
                    <script>
                        bindCheck('$alfabet-cx-${s.toSnake()}', '$alfabet-file-${s.toSnake()}');
                    </script>
    """.trimIndent())
}

fun tab3(no: Int, txt: String, alfabet: String = "b", bth: Int) {
    println("""
                    <div class="form-group">
                        <label for="vc" class="col-sm-3 control-label no-bold">($no) $txt</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="meta[tab_3][${alfabet}_$bth][${txt.toSnake()}]" value="<?=${"$"}meta ? ${"$"}meta['tab_3']['${alfabet}_$bth']['${txt.toSnake()}'] : ''?>">
                        </div>
                    </div>
    """.trimIndent())
}
fun tab3d(no: Int, txt: String) {
    println("""
                    <div class="form-group">
                        <label for="vc" class="col-sm-3 control-label">$no. $txt</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="meta[tab_3][d_$no][${txt.toSnake()}]" value="<?=${"$"}meta ? ${"$"}meta['tab_3']['d_$no']['${txt.toSnake()}'] : ''?>">
                        </div>
                    </div>
    """.trimIndent())
}