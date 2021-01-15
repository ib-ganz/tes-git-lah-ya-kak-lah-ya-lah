fun main(args: Array<String>) {

    val s = s.split("\n")
    var l = mutableListOf("")

    var t = ""
    var label = "";
    var name = "";
    var param = "";
    var f = "";

    s.forEach {

        if (it.contains("inputtext3")) {
            val e = it.split("control-label\">")[1]
            val k = e.split("</l")[0]
            label = k
        }
        if (it.contains("name=")) {

            val afterName = it.split("name=\"")[1]
            val n = afterName.split("\"")[0]

            name = n
        }
        if (it.contains("input-group-addon")) {

            val k = it.split("input-group-addon\">")[1]
            val j = k.replace("</span>", "").replace("\t", " ").trim()

            l.add("""{"label": "$label", "name": "$name", "param": "$j"}""".trimIndent())
        }
        if (it.contains("text-center\"><strong>")) {
            val k = it.split("text-center\"><strong>")[1]
            val j = k.split("</strong>")[0]

            l.add("""{"title": "$j"}""".trimIndent())
        }
    }

    l = l.filter { it.isNotEmpty() }.toMutableList()

    println(l.joinToString(","))

}


val s = """
    
                    <h4 class="box-title text-center"><strong>Hematologi</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Hematologi</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hematologi" name="hematologi" value="<?=isset(        ['hematologi']) ?         ['hematologi'] : ''?>">
                            <span class="input-group-addon"></span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>DL Automatic</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">LEUCO WBC</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="leuco_wbc" name="leuco_wbc" value="<?=isset(        ['leuco_wbc']) ?         ['leuco_wbc'] : ''?>">
                            <span class="input-group-addon">L:4.7-10.3  P:4.3-11.3</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">ERY RBC</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ery_rbc" name="ery_rbc" value="<?=isset(        ['ery_rbc']) ?         ['ery_rbc'] : ''?>">
                            <span class="input-group-addon">L:4.33-5.95  P:3.9-4.5</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">HB HGB</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hb_hgb" name="hb_hgb" value="<?=isset(        ['hb_hgb']) ?         ['hb_hgb'] : ''?>">
                            <span class="input-group-addon">L:13.4-17.7P:11.4-15.1</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">PCV HCT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="pct_hcv" name="pct_hcv" value="<?=isset(        ['cpct_hcv']) ?         ['pct_hcv'] : ''?>">
                            <span class="input-group-addon">L:40-47  P:38-42</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">MCV</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="mcv" name="mcv" value="<?=isset(        ['mcv']) ?         ['cmcv'] : ''?>">
                            <span class="input-group-addon">80-93</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">MCH</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="mch" name="mch" value="<?=isset(        ['mch']) ?         ['umch'] : ''?>">
                            <span class="input-group-addon">27-31</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">MCHC</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="mchc" name="mchc" value="<?=isset(        ['mchc']) ?         ['mchc'] : ''?>">
                            <span class="input-group-addon">32-36</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Trombo PLT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="trombo_plt" name="trombo_plt" value="<?=isset(        ['trombo_plt']) ?         ['trombo_plt'] : ''?>">
                            <span class="input-group-addon">x1000/ul (150-350)</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">DIFF</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="diff" name="diff" value="<?=isset(        ['diff']) ?         ['diff'] : ''?>">
                            <span class="input-group-addon"> </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Ensinofil</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ensinofil" name="ensinofil" value="<?=isset(        ['ensinofil']) ?         ['ensinofil'] : ''?>">
                            <span class="input-group-addon"> 1-2% </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Basofil</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="basofil" name="basofil" value="<?=isset(        ['basofil']) ?         ['basofil'] : ''?>">
                            <span class="input-group-addon">0-1%</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Stab</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="stab" name="stab" value="<?=isset(        ['stab']) ?         ['stab'] : ''?>">
                            <span class="input-group-addon">3-5%</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Segment</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="segment" name="stab" value="<?=isset(        ['segment']) ?         ['segment'] : ''?>">
                            <span class="input-group-addon">54-62% </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Lymfosit</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="lymfosit" name="lymfosit" value="<?=isset(        ['lymfosit']) ?         ['Lymfosit'] : ''?>">
                            <span class="input-group-addon">25-33% </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Monosit</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="monosit" name="monosit" value="<?=isset(        ['monosit']) ?         ['monosit'] : ''?>">
                            <span class="input-group-addon">3-7% </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>FAAL HEMOSTATIS</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">PPT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ppt" name="ppt" value="<?=isset(        ['ppt']) ?         ['ppt'] : ''?>">
                            <span class="input-group-addon">C= 7.8	+/- 2 detikdari C</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">APIT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="apit" name="apit" value="<?=isset(        ['apit']) ?         ['apit'] : ''?>">
                            <span class="input-group-addon"> C= 31.8 +/- 7 detikdari C</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">BT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="bt" name="bt" value="<?=isset(        ['bt']) ?         ['bt'] : ''?>">
                            <span class="input-group-addon">2-3 menit</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">CT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ct" name="ct" value="<?=isset(        ['ct']) ?         ['ct'] : ''?>">
                            <span class="input-group-addon">5-10 menit</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Laju Endap Darah</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="laju_endap_darah" name="laju_endap_darah" value="<?=isset(        ['laju_endap_darah']) ?         ['albumin'] : ''?>">
                            <span class="input-group-addon">L: 0-15;P :0-20mm/jam</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Gol Darah</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gol_darah" name="gol_darah" value="<?=isset(        ['gol_darah']) ?         ['gol_darah'] : ''?>">
                            <span class="input-group-addon"> </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Gol Darah Rhesus</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gol_darah_rhesus" name="gol_darah_rhesus" value="<?=isset(        ['gol_darah_rhesus']) ?         ['gol_darah_rhesus'] : ''?>">
                            <span class="input-group-addon"> </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>FUNGSI GINJAL</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Bun</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="bun" name="bun" value="<?=isset(        ['bun']) ?         ['bun'] : ''?>">
                            <span class="input-group-addon">mg/dl < 22 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Creatinine</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="creatinene" name="creatinene" value="<?=isset(        ['creatinene']) ?         ['creatinene'] : ''?>">
                            <span class="input-group-addon"> mg/dl L: <1.52 ; P: <1.19 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Uric Acid</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="uric_acid" name="uric_acid" value="<?=isset(        ['uric_acid']) ?         ['uric_acid'] : ''?>">
                            <span class="input-group-addon"> mg/dl L: 3.0 – 7.0 ; P: 2.3 – 6.0  </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>GLUKOSA DARAH</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Glukosa Acak</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="glukosa_acak" name="glukosa_acak" value="<?=isset(        ['glukosa_acak']) ?         ['glukosa_acak'] : ''?>">
                            <span class="input-group-addon"> < 160 mg / dl </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Glukosa Puasa</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="glukosa_puasa" name="glukosa_puasa" value="<?=isset(        ['glukosa_puasa']) ?         ['glukosa_puasa'] : ''?>">
                            <span class="input-group-addon"> <120 mg / dl</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Glukosa 2jp</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="glukosa_2jp" name="glukosa_2jp" value="<?=isset(        ['glukosa_2jp']) ?         ['gglukosa_2jp'] : ''?>">
                            <span class="input-group-addon"> < 160 mg / dl </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> HbA-1c</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hbA-1c" name="hbA-1c" value="<?=isset(        ['hbA-1c']) ?         ['hbA-1c'] : ''?>">
                            <span class="input-group-addon"> Normal : < 5.7 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> HbA-1c＿a</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hbA-1c_a" name="hbA-1c_a" value="<?=isset(        ['hbA-1c_a']) ?         ['hbA-1c_a'] : ''?>">
                            <span class="input-group-addon"> Normal : < 5.7 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> HbA-1c＿b</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hbA-1c_b" name="hbA-1c_b" value="<?=isset(        ['hbA-1c_b']) ?         ['hbA-1c_b'] : ''?>">
                            <span class="input-group-addon"> Pre Diabetes : 5.7 – 6.4 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> HbA-1c＿c</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hbA-1c_c" name="hbA-1c_c" value="<?=isset(        ['hbA-1c_c']) ?         ['hbA-1c_c'] : ''?>">
                            <span class="input-group-addon"> Diabetes : >/= 6.5 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> HbA-1c＿d</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hbA-1c_d" name="hbA-1c_d" value="<?=isset(        ['hbA-1c_d']) ?         ['hbA-1c_d'] : ''?>">
                            <span class="input-group-addon"> Target Terapi : < 7.0 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Reduksi</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="reduksi_2" name="reduksi_2" value="<?=isset(        ['reduksi_2']) ?         ['reduksi_2'] : ''?>">
                            <span class="input-group-addon">Negatif</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Gula Darah Sewaktu</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gula_darah_sewaktu" name="gula_darah_sewaktu" value="<?=isset(        ['gula_darah_sewaktu']) ?         ['gula_darah_sewaktu'] : ''?>">
                            <span class="input-group-addon"> <=180 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">GTT:Puasa</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gtt_puasa" name="gtt_puasa" value="<?=isset(        ['gtt_puasa']) ?         ['gtt_puasa'] : ''?>">
                            <span class="input-group-addon">70-100</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">GTT:1/2jam</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gtt_1/2jam" name="gtt_1/2jam" value="<?=isset(        ['gtt_1/2jam']) ?         ['gtt_1/2jam'] : ''?>">
                            <span class="input-group-addon">110-170</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">GTT:1jam</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gtt_1jam" name="gtt_1jam" value="<?=isset(        ['gtt_1jam']) ?         ['gtt_1jam'] : ''?>">
                            <span class="input-group-addon">120-170</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">GTT:1 1/2jam</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gtt_11/2jam" name="gtt_11/2jam" value="<?=isset(        ['gtt_11/2jam']) ?         ['gtt_11/2jam'] : ''?>">
                            <span class="input-group-addon">100-140</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">GTT:2jam</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="gtt_2jam" name="gtt_2jam" value="<?=isset(        ['gtt_2jam']) ?         ['gtt_2jam'] : ''?>">
                            <span class="input-group-addon">20-120</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Hb A1-C</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hb_A-1c" name="hb_A-1c" value="<?=isset(        ['hb_A-1c']) ?         ['hb_A-1c'] : ''?>">
                            <span class="input-group-addon">4.2-7.0</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">II</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ii" name="ii" value="<?=isset(        ['ii']) ?         ['ii'] : ''?>">
                            <span class="input-group-addon">4-7</span>
                        </div>
                    </div>

                </div>
                <div class="col-xs-6">

                    <h4 class="box-title text-center"><strong>FAAL HATI</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">SGOT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="sgot" name="sgot" value="<?=isset(        ['sgot']) ?         ['sgot'] : ''?>">
                            <span class="input-group-addon">L: <37 ; P: <31u/l</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">SGPT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="sgpt" name="sgpt" value="<?=isset(        ['sgpt']) ?         ['sgpt'] : ''?>">
                            <span class="input-group-addon">L: <40 ; P: <31 u/l </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">S Albumin</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="s_albumin" name="s_albumin" value="<?=isset(        ['s_albumin']) ?         ['s_albumin'] : ''?>">
                            <span class="input-group-addon">3.5-5.0 gr %</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Bilirubin</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="bilirubin" name="bilirubin" value="<?=isset(        ['bilirubin']) ?         ['bilirubin'] : ''?>">
                            <span class="input-group-addon"> </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Direct</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="direct" name="direct" value="<?=isset(        ['direct']) ?         ['direct'] : ''?>">
                            <span class="input-group-addon">< 0.25 mg/dl</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Indirect</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="indirect" name="indirect" value="<?=isset(        ['indirect']) ?         ['indirect'] : ''?>">
                            <span class="input-group-addon"> < 0.75 mg / dl </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Total</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="total" name="total" value="<?=isset(        ['total']) ?         ['total'] : ''?>">
                            <span class="input-group-addon"> < 1.00 mg / dl </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>LEMAK DARAH</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Cholesterol</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="cholesterol" name="cholesterol" value="<?=isset(        ['cholesterol']) ?         ['cholesterol'] : ''?>">
                            <span class="input-group-addon"> < 220 mg / dl</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Trigliserida</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="trigliserida" name="trigliserida" value="<?=isset(        ['trigliserida']) ?         ['trigliserida'] : ''?>">
                            <span class="input-group-addon"> < 150 mg / dl</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">HDL Chol</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hdl_chol" name="hdl_chol" value="<?=isset(        ['hdl_chol']) ?         ['hdl_chol'] : ''?>">
                            <span class="input-group-addon">L:> 55 ; P:> 60 mg/dl</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">LDL Chol</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ldl_chol" name="ldl_chol" value="<?=isset(        ['ldl_chol']) ?         ['ldl_chol'] : ''?>">
                            <span class="input-group-addon"> < 150 mg / dl </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong> ELEKTROLIT</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Na</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="na" name="pengecatan_gram" value="<?=isset(        ['na']) ?         ['na'] : ''?>">
                            <span class="input-group-addon"> 135-145 mEg/L </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">K</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="k" name="k" value="<?=isset(        ['k']) ?         ['k'] : ''?>">
                            <span class="input-group-addon"> 3.5- 5.5 mEg/L </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Cl</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="cl" name="cl" value="<?=isset(        ['cl']) ?         ['cl'] : ''?>">
                            <span class="input-group-addon"> 90-110 mEg/L </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>IMMUNOSEROLOGI</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">HBsAg RPHA </label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="hBsAg_rPHA" name="hBsAg_rPHA" value="<?=isset(        ['hBsAg_rPHA']) ?         ['hBsAg_rPHA'] : ''?>">
                            <span class="input-group-addon"> Non Reaktif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">VDRL</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="vdrl" name="vdrl" value="<?=isset(        ['vdrl']) ?         ['vdrl'] : ''?>">
                            <span class="input-group-addon"> Non Reaktif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> IgG Anti DHF</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="igG_anti_dHF" name="igG_anti_dHF" value="<?=isset(        ['igG_anti_dHF']) ?         ['igG_anti_dHF'] : ''?>">
                            <span class="input-group-addon">Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label"> IgM Anti DHF</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="igm_anti_dHF" name="igm_anti_dHF" value="<?=isset(        ['igm_anti_dHF']) ?         ['igm_anti_dHF'] : ''?>">
                            <span class="input-group-addon">Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Anti HIV</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="anti_hiv" name="anti_hiv" value="<?=isset(        ['anti_hiv']) ?         ['anti_hiv'] : ''?>">
                            <span class="input-group-addon">Non Reaktif</span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>WIDAL</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Type O</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="type_o" name="type_o" value="<?=isset(        ['type_o']) ?         ['type_o'] : ''?>">
                            <span class="input-group-addon">Negatif: < 8</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Type H</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="type_h" name="type_h" value="<?=isset(        ['type_h']) ?         ['type_h'] : ''?>">
                            <span class="input-group-addon">Negatif: < 8</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Type A</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="type_a" name="type_a" value="<?=isset(        ['type_a']) ?         ['type_a'] : ''?>">
                            <span class="input-group-addon">Negatif: < 8</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Type B</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="type_b" name="type_b" value="<?=isset(        ['type_b']) ?         ['type_b'] : ''?>">
                            <span class="input-group-addon">Negatif: < 8</span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>URIN LENGKAP</strong></h4>

                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Albumin</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="albumin" name="albumin" value="<?=isset(        ['albumin']) ?         ['albumin'] : ''?>">
                            <span class="input-group-addon"> Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Reduksi</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="Reduksi" name="Reduksi" value="<?=isset(        ['Reduksi']) ?         ['fReduksi'] : ''?>">
                            <span class="input-group-addon"> Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Urobilin</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="urobilin" name="urobilin" value="<?=isset(        ['urobilin']) ?         ['urobilin'] : ''?>">
                            <span class="input-group-addon"> Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Bilirubin</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="birilubin" name="bilirubin" value="<?=isset(        ['birilubin']) ?         ['birilubin'] : ''?>">
                            <span class="input-group-addon"> Negtif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">PH</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="ph" name="ph" value="<?=isset(        ['ph']) ?         ['ph'] : ''?>">
                            <span class="input-group-addon"> 4.5 - 7.5 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Berat Jenis</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="berat_jenis" name="berat_jenis" value="<?=isset(        ['berat_jenis']) ?         ['berat_jenis'] : ''?>">
                            <span class="input-group-addon"> 1.010 - 1.025 </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Blood</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="blood" name="blood" value="<?=isset(        ['blood']) ?         ['blood'] : ''?>">
                            <span class="input-group-addon">Negatif</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Leukosit</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="leukosit" name="leukosit" value="<?=isset(        ['leukosit']) ?         ['leukosit'] : ''?>">
                            <span class="input-group-addon">Negatif</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Nitrit</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="nitrit" name="nitrit" value="<?=isset(        ['nitrit']) ?         ['nitrit'] : ''?>">
                            <span class="input-group-addon">Negatif</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Keton</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="keton" name="keton" value="<?=isset(        ['keton']) ?         ['keton'] : ''?>">
                            <span class="input-group-addon">Negatif</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">SEDIMENT</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="sediment" name="sediment" value="<?=isset(        ['sediment']) ?         ['sediment'] : ''?>">
                            <span class="input-group-addon"> </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Eritrocyt</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="eritrocyt" name="eritrocyt" value="<?=isset(        ['eritrocyt']) ?         ['eritrocyt'] : ''?>">
                            <span class="input-group-addon"> 0 - 1 /lp </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Leukosit</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="leukosit" name="leukosit" value="<?=isset(        ['leukosit']) ?         ['leukosit'] : ''?>">
                            <span class="input-group-addon">0 - 1 /lp</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Epitel</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="epitel" name="epitel" value="<?=isset(        ['epitel']) ?         ['epitel'] : ''?>">
                            <span class="input-group-addon"> </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Silinder</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="silinder" name="silinder" value="<?=isset(        ['silinder']) ?         ['silinder'] : ''?>">
                            <span class="input-group-addon"> Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Kristal</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="kristal" name="kristal" value="<?=isset(        ['kristal']) ?         ['kristal'] : ''?>">
                            <span class="input-group-addon"> Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Lain - Lain</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="lain_lain" name="lain_lain" value="<?=isset(        ['lain_lain']) ?         ['lain_lain'] : ''?>">
                            <span class="input-group-addon"> Negatif </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputtext3" class="col-sm-3 control-label">Mikroalbumin</label>
                        <div class="input-group col-sm-8 col-md-8 col-sm-8 col-lg-8">
                            <input type="text" class="form-control" id="mikroalbumin" name="mikroalbumin" value="<?=isset(        ['mikroalbumin']) ?         ['mikroalbumin'] : ''?>">
                            <span class="input-group-addon"> < 20 mg /L </span>
                        </div>
                    </div>

                    <h4 class="box-title text-center"><strong>PPT Test Pack</strong></h4>

""".trimIndent()
