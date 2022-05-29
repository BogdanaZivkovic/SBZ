export class PlantInput {
    constructor(
        public plantSpecies: string,
        public symptoms: any[] | null,
        public affectedParts: any[] | null
    ) {}
}