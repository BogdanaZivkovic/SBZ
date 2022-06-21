export class determinationInputDTO {
    constructor(
        public plantSpecies: any,
        public symptoms: any[] | null,
        public affectedParts: any[] | null,
        public controlMeasureType: any
    ) {}
}