package com.github.tartaricacid.swapadoll.client.bedrock;

import com.github.tartaricacid.swapadoll.client.bedrock.pojo.CubesItem;
import com.github.tartaricacid.swapadoll.client.bedrock.pojo.FaceItem;
import com.github.tartaricacid.swapadoll.client.bedrock.pojo.FaceUVsItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class BedrockModelUtil {
    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(CubesItem.class, new CubesItem.Deserializer())
            .create();

    public static FaceUVsItem singleSouthFace() {
        return new FaceUVsItem(emptyFace(), emptyFace(), emptyFace(), single16xFace(), emptyFace(), emptyFace());
    }

    public static FaceItem single16xFace() {
        return new FaceItem(new float[]{0, 0}, new float[]{16, 16});
    }

    public static FaceItem emptyFace() {
        return new FaceItem(new float[]{0, 0}, new float[]{0, 0});
    }
}
