import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

         deserialize();
    }

    private static void deserialize() {

        String game1 = "{\n" +
                "  \"homeTeam\": {\n" +
                "    \"name\": \"Champaign United\",\n" +
                "    \"players\": [\n" +
                "      {\n" +
                "        \"name\": \"Mercedes Jackson\",\n" +
                "        \"age\": 24,\n" +
                "        \"jerseyNumber\": 13,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Urbana\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"William Glass\",\n" +
                "        \"age\": 21,\n" +
                "        \"jerseyNumber\": 16,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Walter Grulkey\",\n" +
                "        \"age\": 25,\n" +
                "        \"jerseyNumber\": 7,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"St. Louis\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Dale Rose\",\n" +
                "        \"age\": 26,\n" +
                "        \"jerseyNumber\": 18,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Urbana\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Guadalupe Nelson\",\n" +
                "        \"age\": 23,\n" +
                "        \"jerseyNumber\": 26,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"St. Louis\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"John Hankey\",\n" +
                "        \"age\": 22,\n" +
                "        \"jerseyNumber\": 14,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Patricia Jones\",\n" +
                "        \"age\": 19,\n" +
                "        \"jerseyNumber\": 6,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Bloomington\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Chad Sizemore\",\n" +
                "        \"age\": 26,\n" +
                "        \"jerseyNumber\": 27,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Connie Marquez\",\n" +
                "        \"age\": 28,\n" +
                "        \"jerseyNumber\": 8,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"St. Louis\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Robert Good\",\n" +
                "        \"age\": 25,\n" +
                "        \"jerseyNumber\": 4,\n" +
                "        \"position\": \"Attacker\",\n" +
                "        \"hometown\": \"Chicago\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Gary Moore\",\n" +
                "        \"age\": 22,\n" +
                "        \"jerseyNumber\": 17,\n" +
                "        \"position\": \"Goalkeeper\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"awayTeam\": {\n" +
                "    \"name\": \"Urbana International\",\n" +
                "    \"players\": [\n" +
                "      {\n" +
                "        \"name\": \"Mary Kohnz\",\n" +
                "        \"age\": 21,\n" +
                "        \"jerseyNumber\": 9,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Urbana\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Stevie Patrick\",\n" +
                "        \"age\": 27,\n" +
                "        \"jerseyNumber\": 22,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"St. Louis\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Scott Smiley\",\n" +
                "        \"age\": 25,\n" +
                "        \"jerseyNumber\": 27,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Mahomet\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"John Yeiser\",\n" +
                "        \"age\": 26,\n" +
                "        \"jerseyNumber\": 26,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"St. Louis\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Steven White\",\n" +
                "        \"age\": 28,\n" +
                "        \"jerseyNumber\": 11,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Chicago\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Stephen Robertson\",\n" +
                "        \"age\": 29,\n" +
                "        \"jerseyNumber\": 13,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Tina Ocampo\",\n" +
                "        \"age\": 22,\n" +
                "        \"jerseyNumber\": 4,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Bloomington\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Barbara Palmer\",\n" +
                "        \"age\": 24,\n" +
                "        \"jerseyNumber\": 14,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Bloomington\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Malcom Patrick\",\n" +
                "        \"age\": 19,\n" +
                "        \"jerseyNumber\": 10,\n" +
                "        \"position\": \"Defender\",\n" +
                "        \"hometown\": \"Bloomington\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Stephen Bormann\",\n" +
                "        \"age\": 30,\n" +
                "        \"jerseyNumber\": 5,\n" +
                "        \"position\": \"Attacker\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"David Cole\",\n" +
                "        \"age\": 20,\n" +
                "        \"jerseyNumber\": 1,\n" +
                "        \"position\": \"Goalkeeper\",\n" +
                "        \"hometown\": \"Bloomington\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"winner\": \"Urbana International\",\n" +
                "  \"goals\": [\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 10,\n" +
                "      \"scorer\": \"Steven White\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"John Yeiser\",\n" +
                "          \"receiver\": \"Tina Ocampo\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 11,\n" +
                "      \"scorer\": \"Malcom Patrick\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Bormann\",\n" +
                "          \"receiver\": \"Malcom Patrick\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Malcom Patrick\",\n" +
                "          \"receiver\": \"Mary Kohnz\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Mary Kohnz\",\n" +
                "          \"receiver\": \"Tina Ocampo\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Malcom Patrick\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 16,\n" +
                "      \"scorer\": \"Stephen Bormann\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Scott Smiley\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Scott Smiley\",\n" +
                "          \"receiver\": \"Tina Ocampo\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Scott Smiley\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Scott Smiley\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Steven White\",\n" +
                "          \"receiver\": \"Tina Ocampo\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Stephen Bormann\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 22,\n" +
                "      \"scorer\": \"William Glass\",\n" +
                "      \"assist\": \"Patricia Jones\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"William Glass\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 24,\n" +
                "      \"scorer\": \"Dale Rose\",\n" +
                "      \"assist\": \"Guadalupe Nelson\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Dale Rose\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Dale Rose\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Dale Rose\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 27,\n" +
                "      \"scorer\": \"William Glass\",\n" +
                "      \"assist\": \"Guadalupe Nelson\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Walter Grulkey\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Walter Grulkey\",\n" +
                "          \"receiver\": \"William Glass\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"William Glass\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Walter Grulkey\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Walter Grulkey\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"William Glass\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 38,\n" +
                "      \"scorer\": \"John Yeiser\",\n" +
                "      \"assist\": \"Steven White\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Mary Kohnz\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Mary Kohnz\",\n" +
                "          \"receiver\": \"Scott Smiley\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Scott Smiley\",\n" +
                "          \"receiver\": \"Stephen Robertson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Robertson\",\n" +
                "          \"receiver\": \"Barbara Palmer\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Barbara Palmer\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Steven White\",\n" +
                "          \"receiver\": \"John Yeiser\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 39,\n" +
                "      \"scorer\": \"John Hankey\",\n" +
                "      \"assist\": \"Chad Sizemore\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Mercedes Jackson\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"John Hankey\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"John Hankey\",\n" +
                "          \"receiver\": \"Mercedes Jackson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Mercedes Jackson\",\n" +
                "          \"receiver\": \"William Glass\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"William Glass\",\n" +
                "          \"receiver\": \"Chad Sizemore\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Chad Sizemore\",\n" +
                "          \"receiver\": \"John Hankey\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 44,\n" +
                "      \"scorer\": \"Connie Marquez\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Connie Marquez\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 45,\n" +
                "      \"scorer\": \"Steven White\",\n" +
                "      \"assist\": \"Scott Smiley\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Scott Smiley\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Steven White\",\n" +
                "          \"receiver\": \"Stevie Patrick\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stevie Patrick\",\n" +
                "          \"receiver\": \"Scott Smiley\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Scott Smiley\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 49,\n" +
                "      \"scorer\": \"Stevie Patrick\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Stevie Patrick\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Steven White\",\n" +
                "          \"receiver\": \"Stevie Patrick\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stevie Patrick\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Steven White\",\n" +
                "          \"receiver\": \"Stevie Patrick\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stevie Patrick\",\n" +
                "          \"receiver\": \"Steven White\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Steven White\",\n" +
                "          \"receiver\": \"Stevie Patrick\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 54,\n" +
                "      \"scorer\": \"Walter Grulkey\",\n" +
                "      \"assist\": \"Patricia Jones\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Connie Marquez\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Walter Grulkey\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Walter Grulkey\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Mercedes Jackson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Mercedes Jackson\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Walter Grulkey\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 57,\n" +
                "      \"scorer\": \"Dale Rose\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"John Hankey\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"John Hankey\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"John Hankey\",\n" +
                "          \"receiver\": \"Dale Rose\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 58,\n" +
                "      \"scorer\": \"Dale Rose\",\n" +
                "      \"assist\": \"Guadalupe Nelson\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Dale Rose\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Patricia Jones\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Patricia Jones\",\n" +
                "          \"receiver\": \"Guadalupe Nelson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Guadalupe Nelson\",\n" +
                "          \"receiver\": \"Dale Rose\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 63,\n" +
                "      \"scorer\": \"Stephen Bormann\",\n" +
                "      \"assist\": \"Stephen Robertson\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Bormann\",\n" +
                "          \"receiver\": \"Malcom Patrick\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Malcom Patrick\",\n" +
                "          \"receiver\": \"Stephen Robertson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Robertson\",\n" +
                "          \"receiver\": \"Stephen Bormann\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Bormann\",\n" +
                "          \"receiver\": \"Stephen Robertson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Robertson\",\n" +
                "          \"receiver\": \"Stephen Bormann\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 68,\n" +
                "      \"scorer\": \"Stevie Patrick\",\n" +
                "      \"assist\": \"John Yeiser\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Stephen Robertson\",\n" +
                "          \"receiver\": \"John Yeiser\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"John Yeiser\",\n" +
                "          \"receiver\": \"Stevie Patrick\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 77,\n" +
                "      \"scorer\": \"Mary Kohnz\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Barbara Palmer\",\n" +
                "          \"receiver\": \"Malcom Patrick\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Malcom Patrick\",\n" +
                "          \"receiver\": \"Tina Ocampo\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Tina Ocampo\",\n" +
                "          \"receiver\": \"Barbara Palmer\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Barbara Palmer\",\n" +
                "          \"receiver\": \"Mary Kohnz\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Champaign United\",\n" +
                "      \"timestamp\": 80,\n" +
                "      \"scorer\": \"Robert Good\",\n" +
                "      \"assist\": \"Mercedes Jackson\",\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Dale Rose\",\n" +
                "          \"receiver\": \"Mercedes Jackson\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Mercedes Jackson\",\n" +
                "          \"receiver\": \"Robert Good\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"team\": \"Urbana International\",\n" +
                "      \"timestamp\": 85,\n" +
                "      \"scorer\": \"Mary Kohnz\",\n" +
                "      \"assist\": null,\n" +
                "      \"passes\": [\n" +
                "        {\n" +
                "          \"passer\": \"Mary Kohnz\",\n" +
                "          \"receiver\": \"Scott Smiley\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"passer\": \"Scott Smiley\",\n" +
                "          \"receiver\": \"Mary Kohnz\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";

        Gson gson = new Gson();
        Game g1 = gson.fromJson(game1, Game.class);
    }
}
