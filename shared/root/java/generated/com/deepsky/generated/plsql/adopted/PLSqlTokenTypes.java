// $ANTLR 2.7.5 (20050128): "/git_app/sqlassistant_super/github/shared/root/grammars/plsql_parser_ex.g" -> "PLSqlParserAdopted.java"$

package com.deepsky.generated.plsql.adopted;

public interface PLSqlTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int BAD_ML_COMMENT = 4;
	int BAD_CHARACTER = 5;
	int BAD_CHAR_LITERAL = 6;
	int BAD_NUMBER_LITERAL = 7;
	int STORAGE_SIZE = 8;
	int LT = 9;
	int LE = 10;
	int GE = 11;
	int NOT_EQ = 12;
	int CUSTOM_TOKEN = 13;
	int COLON_NEW = 14;
	int COLON_OLD = 15;
	int TABLE_NAME_SPEC = 16;
	int PLSQL_ENV_VAR = 17;
	int ANY_CHARACTER = 18;
	int IDENTIFIER = 19;
	int QUOTED_STR = 20;
	int DOUBLE_QUOTED_STRING = 21;
	int AT_PREFIXED = 22;
	int SEMI = 23;
	int COLON = 24;
	int DOT = 25;
	int COMMA = 26;
	int ASTERISK = 27;
	int OPEN_PAREN = 28;
	int CLOSE_PAREN = 29;
	int PLUS = 30;
	int MINUS = 31;
	int DIVIDE = 32;
	int BACKSLASH = 33;
	int EQ = 34;
	int PERCENTAGE = 35;
	int DOUBLEDOT = 36;
	int CONCAT = 37;
	int START_LABEL = 38;
	int DOLLAR = 39;
	int END_LABEL = 40;
	int ASSIGNMENT_EQ = 41;
	int PASS_BY_NAME = 42;
	int VERTBAR = 43;
	int GT = 44;
	int NUMBER = 45;
	int N = 46;
	int WS = 47;
	int LF = 48;
	int SL_COMMENT = 49;
	int ML_COMMENT = 50;
	int IF_COND_CMPL = 51;
	int THEN_COND_CMPL = 52;
	int ELSE_COND_CMPL = 53;
	int END_COND_CMPL = 54;
	int ERROR_COND_CMPL = 55;
	int START_RULE = 56;
	int ERROR_TOKEN_A = 57;
	int PACKAGE_SPEC = 58;
	int PACKAGE_BODY = 59;
	int PACKAGE_NAME = 60;
	int PACKAGE_OBJ_BODY = 61;
	int RECORD_TYPE_DECL = 62;
	int SELECT_EXPRESSION = 63;
	int SELECT_EXPRESSION_UNION = 64;
	int PLSQL_BLOCK = 65;
	int PLSQL_BLOCK_END = 66;
	int CURSOR_DECLARATION = 67;
	int VARIABLE_DECLARATION = 68;
	int PROCEDURE_BODY = 69;
	int FUNCTION_BODY = 70;
	int PARAMETER_SPEC = 71;
	int SQL_STATEMENT = 72;
	int IF_STATEMENT = 73;
	int LOOP_STATEMENT = 74;
	int STATEMENT = 75;
	int TABLE_REFERENCE_LIST = 76;
	int TABLE_REFERENCE_LIST_FROM = 77;
	int WHERE_CONDITION = 78;
	int SUBQUERY = 79;
	int SQL_IDENTIFIER = 80;
	int FUNCTION = 81;
	int GROUP_FUNCTION = 82;
	int USER_FUNCTION = 83;
	int MULTIPLY = 84;
	int ARGUMENT = 85;
	int ARGUMENT_LIST = 86;
	int FIELD_NAME = 87;
	int PLSQL_EXPR_LIST_USING = 88;
	int EXPR_LIST = 89;
	int DECLARE_LIST = 90;
	int FUNCTION_CALL = 91;
	int PACKAGE_INIT_SECTION = 92;
	int CALL_ARGUMENT_LIST = 93;
	int SPEC_CALL_ARGUMENT_LIST = 94;
	int QUERY_PARTITION_CLAUSE = 95;
	int EXTRACT_OPTIONS = 96;
	int CALL_ARGUMENT = 97;
	int BASE_EXRESSION = 98;
	int COLUMN_SPEC = 99;
	int LOGICAL_AND = 100;
	int LOGICAL_OR = 101;
	int CASE_EXPRESSION_SMPL = 102;
	int CASE_EXPRESSION_SRCH = 103;
	int CASE_STATEMENT = 104;
	int COUNT_FUNC = 105;
	int RANK_FUNCTION = 106;
	int LEAD_FUNCTION = 107;
	int LAG_FUNCTION = 108;
	int TRIM_FUNC = 109;
	int DECODE_FUNC = 110;
	int COLUMN_SPEC_LIST = 111;
	int INSERT_COMMAND = 112;
	int UPDATE_COMMAND = 113;
	int DELETE_COMMAND = 114;
	int MERGE_COMMAND = 115;
	int MERGE_WHEN_COMMAND = 116;
	int STRING_LITERAL = 117;
	int NUMERIC_LITERAL = 118;
	int BOOLEAN_LITERAL = 119;
	int RETURN_TYPE = 120;
	int TYPE_SPEC = 121;
	int VARIABLE_NAME = 122;
	int COLUMN_OUTER_JOIN = 123;
	int LOGICAL_FACTOR = 124;
	int TABLE_ALIAS = 125;
	int CAST_FUNC = 126;
	int VAR_REF = 127;
	int PLSQL_VAR_REF = 128;
	int PARAMETER_REF = 129;
	int EXCEPTION_SECTION = 130;
	int SELECTED_TABLE = 131;
	int CREATE_PROCEDURE = 132;
	int CREATE_FUNCTION = 133;
	int COMMIT_STATEMENT = 134;
	int ROLLBACK_STATEMENT = 135;
	int NULL_STATEMENT = 136;
	int ASSIGNMENT_STATEMENT = 137;
	int PROCEDURE_CALL = 138;
	int RETURN_STATEMENT = 139;
	int LOCK_TABLE_STATEMENT = 140;
	int OPEN_STATEMENT = 141;
	int FETCH_STATEMENT = 142;
	int SET_TRN_STATEMENT = 143;
	int CLOSE_STATEMENT = 144;
	int OBJECT_NAME = 145;
	int PARAMETER_NAME = 146;
	int DEFAULT = 147;
	int THEN_STATEMENT = 148;
	int ELSIF_STATEMENT = 149;
	int ELSE_STATEMENT = 150;
	int STATEMENT_LIST = 151;
	int RELATION_CONDITION = 152;
	int ISNULL_CONDITION = 153;
	int LIKE_CONDITION = 154;
	int BETWEEN_CONDITION = 155;
	int IN_CONDITION = 156;
	int PARENTHESIZED_EXPR = 157;
	int ORDER_CLAUSE = 158;
	int CONNECT_CLAUSE = 159;
	int GROUP_CLAUSE = 160;
	int INTO_CLAUSE = 161;
	int FOR_UPDATE_CLAUSE = 162;
	int ASTERISK1 = 163;
	int ROWCOUNT_EXRESSION = 164;
	int MULTIPLICATION_OP = 165;
	int DIVIDE_OP = 166;
	int PLUS_OP = 167;
	int MINUS_OP = 168;
	int CONCAT_OP = 169;
	int CURSOR_NAME = 170;
	int CURSOR_NAME_REF = 171;
	int DATATYPE = 172;
	int EXTRACT_DATE_FUNC = 173;
	int ANSI_JOIN_TAB_SPEC = 174;
	int INTERVAL_DAY_TO_SEC_EXPR = 175;
	int INTERVAL_YEAR_TO_MONTH_EXPR = 176;
	int INTERVAL_CONST = 177;
	int USER_CONST = 178;
	int SYSDATE_CONST = 179;
	int SYSTIMESTAMP_CONST = 180;
	int CURRENT_TIMESTAMP_CONST = 181;
	int ALIAS_NAME = 182;
	int EXISTS_EXPR = 183;
	int SUBQUERY_EXPR = 184;
	int TYPE_NAME_REF = 185;
	int TYPE_NAME = 186;
	int SORTED_DEF = 187;
	int RAISE_STATEMENT = 188;
	int PACKAGE_OBJ_SPEC = 189;
	int PROCEDURE_SPEC = 190;
	int SIMPLE_UPDATE_COMMAND = 191;
	int SUBQUERY_UPDATE_COMMAND = 192;
	int IMMEDIATE_COMMAND = 193;
	int FUNCTION_SPEC = 194;
	int NEGATE_FACTOR = 195;
	int TABLE_TYPE_REF = 196;
	int COLUMN_TYPE_REF = 197;
	int STATEMENT_ANNOT = 198;
	int ASTERISK_COLUMN = 199;
	int IDENT_ASTERISK_COLUMN = 200;
	int EXPR_COLUMN = 201;
	int TABLE_REF = 202;
	int TABLE_REF_WITH_LINK = 203;
	int FROM_SUBQUERY = 204;
	int FROM_PLAIN_TABLE = 205;
	int SCHEMA_NAME = 206;
	int COLUMN_NAME_REF = 207;
	int ARITHMETIC_EXPR = 208;
	int ASSIGNMENT_OP = 209;
	int DBTIMEZONE = 210;
	int SUBQUERY_CONDITION = 211;
	int RECORD_ITEM = 212;
	int EXCEPTION_DECL = 213;
	int COMPLEX_NAME = 214;
	int CHARACTER_SET = 215;
	int AUTHID = 216;
	int RESTRICT_REF_PRAGMA = 217;
	int AUTONOMOUS_TRN_PRAGMA = 218;
	int EXCEPTION_PRAGMA = 219;
	int FIPSFLAG_PRAGMA = 220;
	int BUILTIN_PRAGMA = 221;
	int INTERFACE_PRAGMA = 222;
	int TIMESTAMPG_PRAGMA = 223;
	int SERIALLY_REUSABLE_PRAGMA = 224;
	int TIMESTAMP_CONST = 225;
	int SUBTYPE_DECL = 226;
	int MEMBER_OF = 227;
	int SQLPLUS_SET = 228;
	int SQLPLUS_COMMAND = 229;
	int SQLPLUS_SHOW = 230;
	int SQLPLUS_DEFINE = 231;
	int SQLPLUS_VARIABLE = 232;
	int SQLPLUS_EXEC = 233;
	int SQLPLUS_WHENEVER = 234;
	int SQLPLUS_PROMPT = 235;
	int SQLPLUS_COLUMN = 236;
	int SQLPLUS_START = 237;
	int SQLPLUS_SERVEROUTPUT = 238;
	int SQLPLUS_REPFOOTER = 239;
	int SQLPLUS_REPHEADER = 240;
	int SQLPLUS_EXIT = 241;
	int SQLPLUS_QUIT = 242;
	int SQLPLUS_RUNSCRIPT = 243;
	int SQLPLUS_SPOOL = 244;
	int OR_LOGICAL = 245;
	int AND_LOGICAL = 246;
	int NOT_LOGICAL = 247;
	int LOGICAL_EXPR = 248;
	int RELATION_OP = 249;
	int SEQUENCE_EXPR = 250;
	int SEQUENCE_REF = 251;
	int ALIAS_IDENT = 252;
	int COLUMN_NAME_DDL = 253;
	int COLUMN_DEF = 254;
	int TABLE_DEF = 255;
	int TABLE_COLLECTION = 256;
	int VARRAY_COLLECTION = 257;
	int REF_CURSOR = 258;
	int OBJECT_TYPE_DEF = 259;
	int AT_TIME_ZONE_EXPR = 260;
	int TIMEZONE_SPEC = 261;
	int ALTER_TABLE = 262;
	int ALTER_GENERIC = 263;
	int CREATE_TEMP_TABLE = 264;
	int COMMENT = 265;
	int COMMENT_STR = 266;
	int CREATE_INDEX = 267;
	int INSERT_INTO_SUBQUERY_COMMAND = 268;
	int CONDITIONAL_COMPILATION = 269;
	int COND_COMP_SEQ = 270;
	int COND_COMP_SEQ2 = 271;
	int COND_COMP_ERROR = 272;
	int COLUMN_NAME_LIST = 273;
	int OWNER_COLUMN_NAME_LIST = 274;
	int CREATE_VIEW = 275;
	int DATATYPE_PARAM_INFO = 276;
	int CREATE_VIEW_COLUMN_DEF = 277;
	int TABLE_FUNCTION = 278;
	int ROWNUM = 279;
	int ROWID = 280;
	int CUSTOM_AGGR_FUNCTION = 281;
	int LAST_STMT_RESULT_NUM = 282;
	int LAST_STMT_RESULT_BOOL = 283;
	int CURRENT_OF_CLAUSE = 284;
	int CURSOR_STATE = 285;
	int SQLCODE_SYSVAR = 286;
	int SQLERRM_SYSVAR = 287;
	int COLLECTION_METHOD_CALL = 288;
	int COLLECTION_METHOD_CALL2 = 289;
	int C_RECORD_ITEM_REF = 290;
	int CALLABLE_NAME_REF = 291;
	int TRUNCATE_TABLE = 292;
	int DROP_VIEW = 293;
	int DROP_TABLE = 294;
	int DROP_FUNCTION = 295;
	int DROP_PROCEDURE = 296;
	int DROP_PACKAGE = 297;
	int DROP_INDEX = 298;
	int DROP_SEQUENCE = 299;
	int DROP_TYPE = 300;
	int DROP_OPERATOR = 301;
	int DROP_SYNONYM = 302;
	int DROP_USER = 303;
	int DROP_ROLE = 304;
	int DROP_LIBRARY = 305;
	int DROP_DB_LINK = 306;
	int DROP_DIRECTORY = 307;
	int DROP_TRIGGER = 308;
	int CREATE_SYNONYM = 309;
	int SYNONYM_NAME = 310;
	int SYNONYM_OBJ = 311;
	int SYNONYM_OBJ_WITH_LINK = 312;
	int COLUMN_PK_SPEC = 313;
	int COLUMN_FK_SPEC = 314;
	int NOT_NULL_STMT = 315;
	int COLUMN_CHECK_CONSTRAINT = 316;
	int COLUMN_NOT_NULL_CONSTRAINT = 317;
	int PK_SPEC = 318;
	int FK_SPEC = 319;
	int UNIQUE_CONSTRAINT = 320;
	int CHECK_CONSTRAINT = 321;
	int CONSTRAINT_NAME = 322;
	int ADD_CONSTRAINT = 323;
	int ADD_PRIMARY_KEY = 324;
	int IOT_TYPE = 325;
	int HEAP_ORGINIZED = 326;
	int EXTERNAL_TYPE = 327;
	int EXTERNAL_TABLE_SPEC = 328;
	int WRITE_ACCESS_PARAMS_SPEC = 329;
	int LOADER_ACCESS_PARAMS = 330;
	int EXT_FIELD_SPEC_LIST = 331;
	int EXT_FIELD_SPEC = 332;
	int RECORD_FMT_SPEC = 333;
	int EXT_TABLE_LOCATION_SPEC = 334;
	int STORAGE_PARAM = 335;
	int STORAGE_SPEC = 336;
	int PARALLEL_CLAUSE = 337;
	int REJECT_SPEC = 338;
	int NAME_FRAGMENT = 339;
	int EXEC_NAME_REF = 340;
	int COLLECTION_METHOD_NAME = 341;
	int V_COLUMN_DEF = 342;
	int TABLE_NAME_DDL = 343;
	int VIEW_NAME = 344;
	int INDEX_NAME = 345;
	int VIEW_NAME_DDL = 346;
	int CREATE_TRIGGER = 347;
	int CREATE_DIRECTORY = 348;
	int CREATE_DB_LINK = 349;
	int CREATE_SEQUENCE = 350;
	int TRIGGER_FOR_EACH = 351;
	int TRIGGER_NAME = 352;
	int ALTER_TRIGGER = 353;
	int DB_EVNT_TRIGGER_CLAUSE = 354;
	int DDL_TRIGGER_CLAUSE = 355;
	int DML_TRIGGER_CLAUSE = 356;
	int TRIGGER_COLUMN_REF = 357;
	int INSTEADOF_TRIGGER = 358;
	int TRIGGER_TARGET = 359;
	int FORALL_LOOP_SPEC = 360;
	int CURSOR_REF_LOOP_SPEC = 361;
	int CURSOR_LOOP_SPEC = 362;
	int CURSOR_LOOP_INDEX = 363;
	int NUM_LOOP_INDEX = 364;
	int NUMERIC_LOOP_SPEC = 365;
	int RECORD_ITEM_NAME = 366;
	int GOTO_STATEMENT = 367;
	int EXIT_STATEMENT = 368;
	int LABEL_NAME = 369;
	int PARTITION_SPEC = 370;
	int RANGE_PARTITION = 371;
	int HASH_PARTITION = 372;
	int MONITORING_CLAUSE = 373;
	int CREATE_TABLESPACE = 374;
	int DROP_TABLESPACE = 375;
	int TABLESPACE_NAME = 376;
	int ALTER_TABLESPACE = 377;
	int CREATE_TYPE = 378;
	int BIND_VAR = 379;
	int RETURNING_CLAUSE = 380;
	int LITERAL_package = 381;
	int LITERAL_body = 382;
	int LITERAL_alter = 383;
	int LITERAL_drop = 384;
	int LITERAL_table = 385;
	int LITERAL_purge = 386;
	int LITERAL_view = 387;
	int LITERAL_cascade = 388;
	int LITERAL_constraints = 389;
	int LITERAL_function = 390;
	int LITERAL_procedure = 391;
	int LITERAL_index = 392;
	int LITERAL_force = 393;
	int LITERAL_sequence = 394;
	int LITERAL_type = 395;
	int LITERAL_validate = 396;
	int LITERAL_public = 397;
	int LITERAL_synonym = 398;
	int LITERAL_operator = 399;
	int LITERAL_user = 400;
	int LITERAL_role = 401;
	int LITERAL_directory = 402;
	int LITERAL_library = 403;
	int LITERAL_database = 404;
	int LITERAL_link = 405;
	int LITERAL_trigger = 406;
	int LITERAL_associate = 407;
	int LITERAL_statistics = 408;
	int LITERAL_with = 409;
	int LITERAL_column = 410;
	int LITERAL_functions = 411;
	int LITERAL_packages = 412;
	int LITERAL_types = 413;
	int LITERAL_indexes = 414;
	int LITERAL_indextypes = 415;
	int LITERAL_system = 416;
	int LITERAL_managed = 417;
	int LITERAL_storage = 418;
	int LITERAL_default = 419;
	int LITERAL_cost = 420;
	int LITERAL_selectivity = 421;
	int LITERAL_using = 422;
	int LITERAL_null = 423;
	int LITERAL_truncate = 424;
	int LITERAL_comment = 425;
	int LITERAL_on = 426;
	int LITERAL_is = 427;
	int LITERAL_not = 428;
	int LITERAL_disable = 429;
	int LITERAL_enable = 430;
	int LITERAL_row = 431;
	int LITERAL_movement = 432;
	int LITERAL_constraint = 433;
	int LITERAL_primary = 434;
	int LITERAL_key = 435;
	int LITERAL_references = 436;
	int LITERAL_rely = 437;
	int LITERAL_check = 438;
	int LITERAL_unique = 439;
	int LITERAL_sysdate = 440;
	int LITERAL_systimestamp = 441;
	int LITERAL_set = 442;
	int LITERAL_long = 443;
	int LITERAL_show = 444;
	int LITERAL_var = 445;
	int LITERAL_variable = 446;
	int LITERAL_col = 447;
	int LITERAL_exec = 448;
	int LITERAL_execute = 449;
	int LITERAL_whenever = 450;
	int LITERAL_sqlerror = 451;
	int LITERAL_oserror = 452;
	int LITERAL_exit = 453;
	int LITERAL_continue = 454;
	int LITERAL_commit = 455;
	int LITERAL_rollback = 456;
	int LITERAL_none = 457;
	int LITERAL_def = 458;
	int LITERAL_define = 459;
	int LITERAL_prompt = 460;
	int LITERAL_rem = 461;
	int LITERAL_host = 462;
	int LITERAL_quit = 463;
	int LITERAL_spool = 464;
	int LITERAL_sta = 465;
	int LITERAL_start = 466;
	int LITERAL_repfooter = 467;
	int LITERAL_off = 468;
	int LITERAL_repheader = 469;
	int LITERAL_serveroutput = 470;
	int LITERAL_begin = 471;
	int LITERAL_declare = 472;
	int DOUBLE_DOT = 473;
	int LITERAL_create = 474;
	int LITERAL_or = 475;
	int LITERAL_replace = 476;
	int LITERAL_global = 477;
	int LITERAL_temporary = 478;
	int LITERAL_bigfile = 479;
	int LITERAL_smallfile = 480;
	int LITERAL_tablespace = 481;
	int LITERAL_tempfile = 482;
	int LITERAL_undo = 483;
	int LITERAL_datafile = 484;
	int LITERAL_next = 485;
	int LITERAL_maxsize = 486;
	int LITERAL_size = 487;
	int LITERAL_reuse = 488;
	int LITERAL_extent = 489;
	int LITERAL_management = 490;
	int LITERAL_local = 491;
	int LITERAL_uniform = 492;
	int LITERAL_dictionary = 493;
	int LITERAL_retention = 494;
	int LITERAL_guarantee = 495;
	int LITERAL_noguarantee = 496;
	int LITERAL_autoextend = 497;
	int LITERAL_group = 498;
	int LITERAL_logging = 499;
	int LITERAL_nologging = 500;
	int LITERAL_no = 501;
	int LITERAL_online = 502;
	int LITERAL_offline = 503;
	int LITERAL_normal = 504;
	int LITERAL_immediate = 505;
	int LITERAL_read = 506;
	int LITERAL_only = 507;
	int LITERAL_write = 508;
	int LITERAL_permanent = 509;
	int LITERAL_including = 510;
	int LITERAL_contents = 511;
	int LITERAL_and = 512;
	int LITERAL_datafiles = 513;
	int LITERAL_add = 514;
	int LITERAL_rename = 515;
	int LITERAL_to = 516;
	int LITERAL_end = 517;
	int LITERAL_backup = 518;
	int LITERAL_coalesce = 519;
	int LITERAL_minimum = 520;
	int LITERAL_maxvalue = 521;
	int LITERAL_minvalue = 522;
	int LITERAL_cycle = 523;
	int LITERAL_nocycle = 524;
	int LITERAL_cache = 525;
	int LITERAL_nocache = 526;
	int LITERAL_increment = 527;
	int LITERAL_by = 528;
	int LITERAL_order = 529;
	int LITERAL_noorder = 530;
	int LITERAL_for = 531;
	int LITERAL_connect = 532;
	int LITERAL_identified = 533;
	int LITERAL_after = 534;
	int LITERAL_before = 535;
	int LITERAL_startup = 536;
	int LITERAL_shutdown = 537;
	int LITERAL_servererror = 538;
	int LITERAL_logon = 539;
	int LITERAL_logoff = 540;
	int LITERAL_analyze = 541;
	int LITERAL_audit = 542;
	int LITERAL_noaudit = 543;
	int LITERAL_ddl = 544;
	int LITERAL_diassociate = 545;
	int LITERAL_grant = 546;
	int LITERAL_revoke = 547;
	int LITERAL_schema = 548;
	int LITERAL_instead = 549;
	int LITERAL_of = 550;
	int LITERAL_delete = 551;
	int LITERAL_insert = 552;
	int LITERAL_update = 553;
	int LITERAL_each = 554;
	int LITERAL_referencing = 555;
	int LITERAL_old = 556;
	int LITERAL_as = 557;
	int LITERAL_new = 558;
	int LITERAL_when = 559;
	int LITERAL_bitmap = 560;
	int LITERAL_asc = 561;
	int LITERAL_desc = 562;
	int LITERAL_preserve = 563;
	int LITERAL_rows = 564;
	int LITERAL_nested = 565;
	int LITERAL_store = 566;
	int LITERAL_return = 567;
	int LITERAL_locator = 568;
	int LITERAL_value = 569;
	int LITERAL_lob = 570;
	int LITERAL_chunk = 571;
	int LITERAL_reads = 572;
	int LITERAL_pctversion = 573;
	int LITERAL_freepools = 574;
	int LITERAL_in = 575;
	int LITERAL_segment = 576;
	int LITERAL_creation = 577;
	int LITERAL_deferred = 578;
	int LITERAL_cluster = 579;
	int LITERAL_pctthreshold = 580;
	int LITERAL_filesystem_like_logging = 581;
	int LITERAL_compress = 582;
	int LITERAL_all = 583;
	int LITERAL_direct_load = 584;
	int LITERAL_operations = 585;
	int LITERAL_nocompress = 586;
	int LITERAL_pctfree = 587;
	int LITERAL_pctused = 588;
	int LITERAL_initrans = 589;
	int LITERAL_maxtrans = 590;
	int LITERAL_compute = 591;
	int LITERAL_parallel = 592;
	int LITERAL_noparallel = 593;
	int LITERAL_monitoring = 594;
	int LITERAL_nomonitoring = 595;
	int LITERAL_overflow = 596;
	int LITERAL_partition = 597;
	int LITERAL_range = 598;
	int LITERAL_interval = 599;
	int LITERAL_values = 600;
	int LITERAL_less = 601;
	int LITERAL_than = 602;
	int LITERAL_hash = 603;
	int LITERAL_partitions = 604;
	int LITERAL_novalidate = 605;
	int LITERAL_organization = 606;
	int LITERAL_heap = 607;
	int LITERAL_external = 608;
	int LITERAL_degree = 609;
	int LITERAL_instances = 610;
	int LITERAL_reject = 611;
	int LITERAL_limit = 612;
	int LITERAL_unlimited = 613;
	int LITERAL_initial = 614;
	int LITERAL_minextents = 615;
	int LITERAL_maxextents = 616;
	int LITERAL_pctincrease = 617;
	int LITERAL_freelists = 618;
	int LITERAL_freelist = 619;
	int LITERAL_groups = 620;
	int LITERAL_optimal = 621;
	int LITERAL_buffer_pool = 622;
	int LITERAL_keep = 623;
	int LITERAL_recycle = 624;
	int LITERAL_flash_cache = 625;
	int LITERAL_cell_flash_cache = 626;
	int LITERAL_encrypt = 627;
	int LITERAL_foreign = 628;
	int LITERAL_restrict = 629;
	int LITERAL_action = 630;
	int LITERAL_modify = 631;
	int LITERAL_sort = 632;
	int LITERAL_nosort = 633;
	int LITERAL_reverse = 634;
	int LITERAL_visible = 635;
	int LITERAL_novisible = 636;
	int LITERAL_under = 637;
	int LITERAL_final = 638;
	int LITERAL_object = 639;
	int LITERAL_record = 640;
	int LITERAL_ref = 641;
	int LITERAL_cursor = 642;
	int LITERAL_rowtype = 643;
	int LITERAL_varray = 644;
	int LITERAL_option = 645;
	// "view_column_def_$internal$" = 646
	int LITERAL_timestamp = 647;
	int LITERAL_authid = 648;
	int LITERAL_wrapped = 649;
	int LITERAL_pragma = 650;
	int LITERAL_restrict_references = 651;
	int LITERAL_interface = 652;
	int LITERAL_builtin = 653;
	int LITERAL_fipsflag = 654;
	int LITERAL_exception_init = 655;
	int LITERAL_constant = 656;
	int LITERAL_subtype = 657;
	int LITERAL_loop = 658;
	int LITERAL_while = 659;
	int LITERAL_forall = 660;
	int LITERAL_if = 661;
	int LITERAL_goto = 662;
	int LITERAL_raise = 663;
	int LITERAL_case = 664;
	int LITERAL_select = 665;
	int LITERAL_merge = 666;
	int LITERAL_lock = 667;
	int LITERAL_open = 668;
	int LITERAL_close = 669;
	int LITERAL_fetch = 670;
	int LITERAL_sql = 671;
	int LITERAL_found = 672;
	int LITERAL_notfound = 673;
	int LITERAL_rowcount = 674;
	int LITERAL_isopen = 675;
	int LITERAL_bulk_rowcount = 676;
	int LITERAL_bulk_exceptions = 677;
	int LITERAL_error_index = 678;
	int LITERAL_error_code = 679;
	int LITERAL_count = 680;
	int LITERAL_then = 681;
	int LITERAL_else = 682;
	int LITERAL_autonomous_transaction = 683;
	int LITERAL_prior = 684;
	int LITERAL_number = 685;
	int LITERAL_binary_integer = 686;
	int LITERAL_natural = 687;
	int LITERAL_positive = 688;
	int LITERAL_char = 689;
	int LITERAL_byte = 690;
	int LITERAL_raw = 691;
	int LITERAL_boolean = 692;
	int LITERAL_date = 693;
	int LITERAL_time = 694;
	int LITERAL_zone = 695;
	int LITERAL_year = 696;
	int LITERAL_month = 697;
	int LITERAL_day = 698;
	int LITERAL_second = 699;
	int LITERAL_smallint = 700;
	int LITERAL_real = 701;
	int LITERAL_numeric = 702;
	int LITERAL_int = 703;
	int LITERAL_integer = 704;
	int LITERAL_pls_integer = 705;
	int LITERAL_double = 706;
	int LITERAL_precision = 707;
	int LITERAL_float = 708;
	int LITERAL_decimal = 709;
	int LITERAL_varchar = 710;
	// "varchar2" = 711
	int LITERAL_nvarchar = 712;
	// "nvarchar2" = 713
	int LITERAL_character = 714;
	int LITERAL_rowid = 715;
	int LITERAL_blob = 716;
	int LITERAL_clob = 717;
	int LITERAL_nclob = 718;
	int LITERAL_bfile = 719;
	int LITERAL_out = 720;
	int LITERAL_nocopy = 721;
	int LITERAL_any_cs = 722;
	int LITERAL_charset = 723;
	int LITERAL_exception = 724;
	int LITERAL_serially_reusable = 725;
	int LITERAL_pipelined = 726;
	int LITERAL_parallel_enable = 727;
	int LITERAL_deterministic = 728;
	int LITERAL_language = 729;
	int LITERAL_java = 730;
	int LITERAL_name = 731;
	int LITERAL_save = 732;
	int LITERAL_exceptions = 733;
	int LITERAL_indices = 734;
	int LITERAL_true = 735;
	int LITERAL_false = 736;
	// "**" = 737
	int LITERAL_at = 738;
	int LITERAL_current = 739;
	int LITERAL_exists = 740;
	int LITERAL_like = 741;
	int LITERAL_escape = 742;
	int LITERAL_between = 743;
	int LITERAL_member = 744;
	int LITERAL_sqlcode = 745;
	int LITERAL_sqlerrm = 746;
	int LITERAL_cast = 747;
	int LITERAL_decode = 748;
	int LITERAL_trim = 749;
	int LITERAL_multiset = 750;
	int LITERAL_lag = 751;
	int LITERAL_lead = 752;
	int LITERAL_rank = 753;
	int LITERAL_dense_rank = 754;
	int LITERAL_extract = 755;
	int LITERAL_minute = 756;
	int LITERAL_hour = 757;
	int LITERAL_any = 758;
	int LITERAL_nextval = 759;
	int LITERAL_currval = 760;
	int LITERAL_over = 761;
	int LITERAL_sessiontimezone = 762;
	int LITERAL_dbtimezone = 763;
	int LITERAL_distinct = 764;
	int LITERAL_from = 765;
	int LITERAL_timezone_hour = 766;
	int LITERAL_timezone_minute = 767;
	int LITERAL_timezone_region = 768;
	int LITERAL_timezone_abbr = 769;
	int LITERAL_leading = 770;
	int LITERAL_trailing = 771;
	int LITERAL_both = 772;
	int LITERAL_work = 773;
	int LITERAL_elsif = 774;
	int LITERAL_union = 775;
	int LITERAL_intersect = 776;
	int LITERAL_minus = 777;
	int LITERAL_bulk = 778;
	int LITERAL_collect = 779;
	int LITERAL_into = 780;
	int LITERAL_session = 781;
	int LITERAL_flush = 782;
	int LITERAL_shared_pool = 783;
	int LITERAL_reset = 784;
	int LITERAL_sid = 785;
	int LITERAL_left = 786;
	int LITERAL_right = 787;
	int LITERAL_inner = 788;
	int LITERAL_outer = 789;
	int LITERAL_join = 790;
	int LITERAL_full = 791;
	int LITERAL_where = 792;
	int LITERAL_current_timestamp = 793;
	int LITERAL_rownum = 794;
	int LITERAL_the = 795;
	int LITERAL_having = 796;
	int LITERAL_nulls = 797;
	int LITERAL_first = 798;
	int LITERAL_last = 799;
	int LITERAL_nowait = 800;
	int LITERAL_wait = 801;
	int LITERAL_matched = 802;
	int LITERAL_returning = 803;
	int LITERAL_transaction = 804;
	int LITERAL_mode = 805;
	int LITERAL_share = 806;
	int LITERAL_exclusive = 807;
	int LITERAL_savepoint = 808;
	int LITERAL_oracle_loader = 809;
	int LITERAL_oracle_datapump = 810;
	int LITERAL_access = 811;
	int LITERAL_parameters = 812;
	int LITERAL_nologfile = 813;
	int LITERAL_logfile = 814;
	int LITERAL_version = 815;
	int LITERAL_compatible = 816;
	int LITERAL_latest = 817;
	int LITERAL_compression = 818;
	int LITERAL_enabled = 819;
	int LITERAL_disabled = 820;
	int LITERAL_encryption = 821;
	int LITERAL_records = 822;
	int LITERAL_fixed = 823;
	int LITERAL_delimited = 824;
	int LITERAL_newline = 825;
	int LITERAL_characterset = 826;
	int LITERAL_data = 827;
	int LITERAL_big = 828;
	int LITERAL_little = 829;
	int LITERAL_endian = 830;
	int LITERAL_mark = 831;
	int LITERAL_nocheck = 832;
	int LITERAL_string = 833;
	int LITERAL_sizes = 834;
	int LITERAL_bytes = 835;
	int LITERAL_characters = 836;
	int LITERAL_load = 837;
	int LITERAL_nobadfile = 838;
	int LITERAL_badfile = 839;
	int LITERAL_nodiscardfile = 840;
	int LITERAL_discardfile = 841;
	int LITERAL_readsize = 842;
	int LITERAL_data_cache = 843;
	int LITERAL_skip = 844;
	int LITERAL_preprocessor = 845;
	int LITERAL_fields = 846;
	int LITERAL_missing = 847;
	int LITERAL_field = 848;
	int LITERAL_are = 849;
	int LITERAL_transforms = 850;
	int LITERAL_concat = 851;
	int LITERAL_lobfile = 852;
	int LITERAL_enclosed = 853;
	int LITERAL_terminated = 854;
	int LITERAL_whitespace = 855;
	int LITERAL_optionally = 856;
	int LITERAL_lrtrim = 857;
	int LITERAL_notrim = 858;
	int LITERAL_ltrim = 859;
	int LITERAL_rtrim = 860;
	int LITERAL_ldrtrim = 861;
	int LITERAL_position = 862;
	int LITERAL_unsigned = 863;
	int LITERAL_zoned = 864;
	int LITERAL_oracle_date = 865;
	int LITERAL_oracle_number = 866;
	int LITERAL_counted = 867;
	int LITERAL_varraw = 868;
	int LITERAL_varcharc = 869;
	int LITERAL_varrawc = 870;
	int LITERAL_date_format = 871;
	int LITERAL_timezone = 872;
	int LITERAL_mask = 873;
	int LITERAL_location = 874;
	int LITERAL_aggregate = 875;
	int LITERAL_ldtrim = 876;
}
