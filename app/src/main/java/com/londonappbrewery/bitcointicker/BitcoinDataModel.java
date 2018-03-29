package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by mjsmj_000 on 29/03/2018.
 */

public class BitcoinDataModel {
    private String mDataConvert;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();
            bitcoinDataModel.mDataConvert = jsonObject.getString("last");
            return bitcoinDataModel;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getDataConvert() {
        return mDataConvert;
    }
}
